/**
 * 
 */
package fit.hrkj.jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * 演示executeUpdate执行DML语句<br>
 * 2019年11月10日下午7:56:30
 * 
 * @author 华软科技
 * @version 1.0
 */
public class ExecuteDML {
	/**
	 * 数据库连接参数配置文件
	 */
	private static String paramFile = "mysql.ini";
	/**
	 * sql语句
	 */
	private static String sql = "insert into jdbc_test(name,age) "
			+ "values('a',18) , ('b',19) , ('c',20)";
	/**
	 * 驱动名
	 */
	private String driver;
	/**
	 * 连接地址
	 */
	private String url;
	/**
	 * 数据库账号
	 */
	private String user;
	/**
	 * 数据库密码
	 */
	private String password;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecuteDML dml = new ExecuteDML();
		dml.initParam(paramFile);
		int result=dml.insertData(sql);
		System.out.println("插入了"+result+"条记录");
	}

	/**
	 * 通过读取缓存文件初始化连接数据库参数
	 * 
	 * @param paramFile 文件地址
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public void initParam(String paramFile) {
		// 创建属性对象
		Properties props = new Properties();
		// 加载属性文件
		try {
			props.load(new FileInputStream(paramFile));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("没有找到此配置文件，请检查项目路径下是否存在" + paramFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("配置文件读取错误，请检查文件内容");
		}
		// 获取缓存文件中的对应数据
		driver = props.getProperty("driver");
		url = props.getProperty("url");
		user = props.getProperty("user");
		password = props.getProperty("password");
	}

	public int insertData(String sql) {
		try (
				// 获取数据库连接
				Connection connection = DriverManager.getConnection(url, user, password);
				// 使用connection来创建一个Statement对象
				Statement statement = connection.createStatement();) {
			// 加载驱动
			Class.forName(driver);
			// 执行DML语句，返回受影响的记录条数
			return statement.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("数据添加失败");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("没有找到驱动，请检查项目的classpath中是否已经添加此驱动");
			e.printStackTrace();
		}
		return 0;

	}
}
