package fit.hrkj.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

/**
 * 演示CachedRowSet的分页支持<br>
 * 2019年11月30日下午1:34:39
 * 
 * @author 华软科技
 * @version 1.0
 */
public class CachedRowSetPage {
	/**
	 * 查询user表的SQL语句
	 */
	private static String sql = "select * from user";
	/**
	 * 一页2条数据
	 */
	private static int pageSize = 2;
	/**
	 * 查询第几页
	 */
	private static int page = 2;

	/**
	 * 程序入口
	 * 
	 * @param args 入口参数
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CachedRowSetPage crsp = new CachedRowSetPage();
		CachedRowSet crs = crsp.query(sql, pageSize, page);// ①
		try {
			TableFormatter.showHeader(crs);
			// 向后滚动结果集
			while (crs.next()) {
				TableFormatter.showBody();
			}
			TableFormatter.showFooter();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 分页查询数据
	 * 
	 * @param sql      查询语句
	 * @param pageSize 每页数据条数
	 * @param page     页数
	 * @return 查询结果
	 */
	public CachedRowSet query(String sql, int pageSize, int page) {
		// 获取数据库连接
		Connection connection = DriverTool.getInstance().getConnection(DriverTool.DBCP);
		try (Statement statement = connection.createStatement(); ResultSet rs = statement.executeQuery(sql);) {
			// 使用RowSetFactory创建RowSetFactory
			RowSetFactory factory = RowSetProvider.newFactory();
			// 创建默认的CachedRowSet
			CachedRowSet cachedRowSet = factory.createCachedRowSet();
			// 设置每页显示pageSize条记录
			cachedRowSet.setPageSize(pageSize);
			// 使用ResultSet装填RowSet，设置从第几条记录开始
			cachedRowSet.populate(rs, (page - 1) * pageSize + 1);
			return cachedRowSet;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}
}
