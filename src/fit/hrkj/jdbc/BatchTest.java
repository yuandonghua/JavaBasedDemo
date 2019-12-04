package fit.hrkj.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * <br>
 * 2019年12月3日下午10:58:07
 * 
 * @author 华软科技
 * @version 1.0
 */
public class BatchTest {
	/**
	 * 程序入口
	 * 
	 * @param args 入口参数
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BatchTest bt = new BatchTest();
		String[] sqls = { "insert into user values(null,'yuandonghua20@hrkj.fit','123qwe',18)",
				"insert into user values(null,'yuandonghua21@hrkj.fit','123qwe',19)",
				"insert into user values(null,'yuandonghua22@hrkj.fit','123qwe',20)",
				// 下面这条SQL语句'aa'的类型与实际id的类型不匹配，
				"insert into user values('aa','yuandonghua23@hrkj.fit','123qwe',20)" // ①
		};
		bt.insertBatch(sqls);
	}

	public void insertBatch(String[] sqls) {
		Statement statement = DriverTool.getInstance().useDefaultConnection(false).createStatement();
		try {
			// 循环多次添加SQL语句
			for (String sql : sqls) {
				statement.addBatch(sql);
			}
			// 同时提交所有的SQL语句
			statement.executeLargeBatch();
			//提交事务
			DriverTool.getInstance().getConnection().commit();
			// 恢复原有的自动提交模式
			DriverTool.getInstance().getConnection().setAutoCommit(true);
			// 关闭资源
			DriverTool.getInstance().close();
			System.out.println("批量提交成功");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("批量提交失败");
			e.printStackTrace();
		}

	}
}
