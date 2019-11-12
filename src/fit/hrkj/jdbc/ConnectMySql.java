package fit.hrkj.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 测试连接数据库<br>
 * 2019年10月27日下午12:53:15
 * 
 * @author 华软科技
 * @version 1.0
 */
public class ConnectMySql {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 加载驱动，使用反射知识，后面会细讲反射
		Class.forName("com.mysql.cj.jdbc.Driver");

		// 使用DriverManager获取数据库连接
		// 其中返回的Connection就代表了Java程序和数据库的连接
		// 不同数据库的URL写法需要查询驱动文档，用户名、密码由DBA分配
		String url = "jdbc:mysql://127.0.0.1:3306/hrkj?useSSL=false&serverTimezone=UTC";
		String user = "root";
		String password = "1234qwer";
		/*
		 * 要执行的SQL语句
		 */
		String sql = "select s.id,s.name,t.id,t.name from student s,teacher t where s.id=t.id";
		try (

				Connection connection = DriverManager.getConnection(url, user, password);

				// 使用Connection来创建一个Statement对象
				Statement statement = connection.createStatement();

				// 返回查询到的结果集
				ResultSet rs = statement.executeQuery(sql);) {
			// ResultSet有一系列的getXxx( 索引 | 列名 ) 方法，用于获取记录指针指向行、特定列的值，不断地使用next()将记录指针下移一行
			// 如果移动之后记录指针依然指向有效行，则next()方法返回true
			while (rs.next()) {
				System.out
						.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3) + "\t" + rs.getString(4));

			}
		}

	}

}
