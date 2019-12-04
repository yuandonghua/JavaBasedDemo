package fit.hrkj.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 演示发生异常时，系统将自动回滚<br>
 * 2019年12月3日下午9:28:40
 * 
 * @author 华软科技
 * @version 1.0
 */
public class TransactionTest {
	/**
	 * 程序入口
	 * 
	 * @param args 入口参数
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TransactionTest tt = new TransactionTest();
		String[] sqls = { "insert into user values(null,'yuandonghua10@hrkj.fit','123qwe',18)",
				"insert into user values(null,'yuandonghua11@hrkj.fit','123qwe',19)",
				"insert into user values(null,'yuandonghua12@hrkj.fit','123qwe',20)",
				// 下面这条SQL语句'aa'的类型与实际id的类型不匹配，
				"insert into user values('aa','yuandonghua12@hrkj.fit','123qwe',20)" // ①
		};
		tt.insertInTransaction(sqls);
	}

	public void insertInTransaction(String[] sqls) {
		Connection connection = DriverTool.getInstance().getConnection();
		try {
			// 关闭自动提交，开启事务
			connection.setAutoCommit(false);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("开启事务失败");
		}

		try {
			Statement statement = connection.createStatement();
			for (String sql : sqls) {
				statement.executeUpdate(sql);
			}
			// 提交事务
			connection.commit();
			System.out.println("事务提交完毕");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("事务提交失败，sql语句有问题，请检查");
		}
	}
}
