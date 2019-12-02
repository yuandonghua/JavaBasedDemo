package fit.hrkj.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

/**
 * 演示CachedRowSet<br>
 * 2019年11月28日下午10:14:43
 * 
 * @author 华软科技
 * @version 1.0
 */
public class CachedRowSetTest {
	/**
	 * 查询user表的SQL语句
	 */
	private static String sql = "select * from user";

	/**
	 * 程序入口
	 * 
	 * @param args 入口参数
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CachedRowSetTest crst = new CachedRowSetTest();
		CachedRowSet crs = crst.query(sql);
		try {
			// 定位到最后一条记录
			crs.afterLast();
			// 展示列名
			TableFormatter.showHeader(crs);
			// 向前滚动结果集
			while (crs.previous()) {
				// 更新数据
				if (crs.getInt(4) > 1) {
					crs.updateString(3, "1111");
					crs.updateRow();
				}
				// 展示每条记录
				TableFormatter.showBody();
			}
			// 展示表格尾部
			TableFormatter.showFooter();

			// 重新获取数据库连接
			Connection newConnection = DriverTool.getInstance().getNewConnection();
			newConnection.setAutoCommit(false);
			// 把对RowSet所做的修改同步到底层数据库
			crs.acceptChanges(newConnection);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public CachedRowSet query(String sql) {
		// 获取数据库连接
		Connection connection = DriverTool.getInstance().getConnection();
		try {
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			// 使用RowSetProvider创建RowSetFactory
			RowSetFactory factory = RowSetProvider.newFactory();
			// 创建默认的CachedRowSet实例
			CachedRowSet crs = factory.createCachedRowSet();
			// 使用ResultSet填装RowSet
			crs.populate(rs);// ①
			// 关闭资源
			if (rs != null) {
				rs.close();
			}
			if (statement != null) {

				statement.close();
			}
			if (connection != null) {

				connection.close();
			}
			return crs;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("出现异常");
		}
		return null;

	}
}
