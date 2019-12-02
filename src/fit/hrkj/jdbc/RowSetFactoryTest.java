package fit.hrkj.jdbc;

import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

/**
 * 演示JdbcRowSet的可滚动特性<br>
 * 2019年11月28日上午10:20:23
 * 
 * @author 华软科技
 * @version 1.0
 */
public class RowSetFactoryTest {
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

		// 使用RowSetProvider创建RowSetFactory
		RowSetFactory factory = null;
		try {
			factory = RowSetProvider.newFactory();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			System.out.println("创建工厂类失败");
		}
		try (
				// 使用RowSetFactory创建默认的JdbcRowSet实例
				JdbcRowSet jdbcRowSet = factory.createJdbcRowSet();) {
			// 设置必要的连接信息
			jdbcRowSet.setUrl(DriverTool.getInstance().getUrl());
			jdbcRowSet.setUsername(DriverTool.getInstance().getUser());
			jdbcRowSet.setPassword(DriverTool.getInstance().getPassword());
			// 设置查询语句
			jdbcRowSet.setCommand(sql);
			// 执行查询
			jdbcRowSet.execute();
			jdbcRowSet.afterLast();
			TableFormatter.showHeader(jdbcRowSet);
			// 向前滚动结果集
			while (jdbcRowSet.previous()) {
				// 不可更新
				if (jdbcRowSet.getInt(4) > 1) {
					jdbcRowSet.updateString("password", "1111");
					jdbcRowSet.updateRow();
				}
				TableFormatter.showBody();
			}
			TableFormatter.showFooter();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
