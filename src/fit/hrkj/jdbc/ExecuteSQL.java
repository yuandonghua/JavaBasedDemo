
package fit.hrkj.jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * 演示通过Statement的execute()方法来执行任意的SQL语句<br>
 * 2019年11月11日下午9:35:34
 * 
 * @author 华软科技
 * @version 1.0
 */
public class ExecuteSQL {
	/**
	 * 数据库连接参数配置文件
	 */
	private static String paramFile = "mysql.ini";
	/**
	 * 删除表jdbc_test的SQL语句
	 */
	private static String dropSQL = "drop table if exists jdbc_test";
	/**
	 * 创建表jdbc_test的SQL语句
	 */
	private static String createSQL = "create table jdbc_test " + "(" + "id int auto_increment primary key,"
			+ "name varchar(255)," + "age int" + ")";
	/**
	 * 插入数据的SQL语句
	 */
	private static String insertSQL = "insert into jdbc_test(name,age) " + "values('ydh',18) , ('hrkj',19) , ('zkhrkj',20)";
	/**
	 * 查询数据的SQL语句
	 */
	private static String selectSQL = "select * from jdbc_test";
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
		ExecuteSQL dml = new ExecuteSQL();
		dml.initParam(paramFile);
		// 删除jdbc_test表
		dml.executeSQL(dropSQL);
		// 创建jdbc_test表
		dml.executeSQL(createSQL);
		// 给jdbc_test表插入数据
		dml.executeSQL(insertSQL);
		// 查询jdbc_test表中的数据
		dml.executeSQL(selectSQL);
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

	public void executeSQL(String sql) {
		try (
				// 获取数据库连接
				Connection connection = DriverManager.getConnection(url, user, password);
				// 使用connection来创建一个Statement对象
				Statement statement = connection.createStatement();) {
			// 加载驱动
			Class.forName(driver);
			// 执行SQL语句，返回Boolean值表示是否包含ResultSet
			boolean hasResultSet = statement.execute(sql);
			// 如果执行后有ResultSet结果集
			if (hasResultSet) {
				try (ResultSet resultSet = statement.getResultSet();) {
					// ResultSetMetaData是用于分析结果集的元数据接口
					ResultSetMetaData metaData = resultSet.getMetaData();
					// 展示表格的列名
					TableFormatter.showHeader(4, resultSet);
					// 迭代输出ResultSet对象
					while (resultSet.next()) {
						// 依次输出每列的值
						TableFormatter.showBody();

					}
					// 展示表格的结尾
					TableFormatter.showFooter();
				}

			} else {
				System.out.println("该SQL语句影响的记录有" + statement.getUpdateCount() + "条");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("数据添加失败");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("没有找到驱动，请检查项目的classpath中是否已经添加此驱动");
			e.printStackTrace();
		}

	}
}
