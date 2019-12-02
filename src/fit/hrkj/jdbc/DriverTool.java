package fit.hrkj.jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * 数据库驱动加载工具<br>
 * 2019年11月19日下午8:39:42
 * 
 * @author 华软科技
 * @version 1.0
 */
public class DriverTool {
	/**
	 * 数据库连接参数配置文件
	 */
	private static String paramFile = "mysql.ini";
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
	 * 工具类实例
	 */
	private static DriverTool instance;
	/**
	 * 数据库连接对象
	 */
	private static Connection connection;

	public static DriverTool getInstance() {
		if (instance == null) {
			instance = new DriverTool();
			instance.initParam(paramFile);
		}
		return instance;
	}

	/**
	 * 通过读取缓存文件初始化连接数据库参数
	 * 
	 * @param paramFile 文件地址
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
		try {
			// 加载驱动
			Class.forName(driver);
			connection = DriverManager.getConnection(DriverTool.getInstance().getUrl(),
					DriverTool.getInstance().getUser(), DriverTool.getInstance().getPassword());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("没有找到驱动，请检查项目的classpath中是否已经添加此驱动");
		} catch (SQLException e) {
			// TODO Auto-generated catch block

			if (e.getMessage().contains("Public Key Retrieval is not allowed")) {
				System.out.println("连接url后面需要加上allowPublicKeyRetrieval=true");
			} else {
				System.out.println("数据库连接失败");
			}
			e.printStackTrace();
		}
	}

	/**
	 * 获取缓存的数据库连接
	 * @return the connection
	 */
	public Connection getConnection() {
		return connection;
	}

	/**
	 * 获取新的数据库连接
	 * @return the connection
	 */
	public Connection getNewConnection() {
		initParam(paramFile);
		return connection;
	}


	/**
	 * 获取数据库信息的配置文件
	 * @return 数据库信息的配置文件
	 */
	public static String getParamFile() {
		return paramFile;
	}

	/**
	 * 设置数据库信息的配置文件
	 * @param paramFile 数据库信息的配置文件
	 */
	public static void setParamFile(String paramFile) {
		DriverTool.paramFile = paramFile;
	}

	/**
	 * 获取数据库的驱动名
	 * @return 数据库的驱动名
	 */
	public String getDriver() {
		return driver;
	}

	/**
	 * 设置数据库的驱动名
	 * @param driver 数据库的驱动名
	 */
	public void setDriver(String driver) {
		this.driver = driver;
	}

	/**
	 * 获取数据库的连接地址
	 * @return 数据库的连接地址
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * 设置数据库的连接地址
	 * @param url 数据库的连接地址
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * 获取数据库的用户
	 * @return 数据库的用户
	 */
	public String getUser() {
		return user;
	}

	/**
	 * 设置数据库的用户
	 * @param user 数据库的用户
	 */
	public void setUser(String user) {
		this.user = user;
	}

	/**
	 * 获取数据库用户的密码
	 * @return 用户的密码
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * 设置数据库用户的密码
	 * @param password 用户的密码
	 */
	public void setPassword(String password) {
		this.password = password;
	}
}
