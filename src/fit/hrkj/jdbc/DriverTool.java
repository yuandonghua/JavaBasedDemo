package fit.hrkj.jdbc;

import java.beans.PropertyVetoException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.apache.commons.dbcp2.BasicDataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

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

	private static Statement statement;
	/**
	 * DBCP数据源，整个程序只需要一个
	 */
	private static BasicDataSource BDS;
	/**
	 * C3P0数据源，整个程序只需要一个
	 */
	private static ComboPooledDataSource CPDS;
	/**
	 * C3P0连接池标识
	 */
	public static final String C3P0 = "C3P0";
	/**
	 * DBCP连接池标识
	 */
	public static final String DBCP = "DBCP";

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
	public DriverTool initParam(String paramFile) {
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
		return this;
	}

	/**
	 * 初始化DBCP参数
	 * 
	 * @return 数据源对象，用来获取Connection
	 */
	private void initDBCP() {
		// TODO Auto-generated method stub
		// 创建数据源对象
		BDS = new BasicDataSource();
		// 设置连接池所需的驱动
		BDS.setDriverClassName(driver);
		// 设置连接数据库的URI
		BDS.setUrl(url);
		// 设置连接数据库的用户名
		BDS.setUsername(user);
		// 设置连接数据库的密码
		BDS.setPassword(password);
		// 设置连接池的初始连接数
		BDS.setInitialSize(5);
		// 设置连接池最多可有多少个活动连接数
		BDS.setMaxTotal(20);
		// 设置连接池中最少有2个空闲的连接
		BDS.setMaxIdle(2);
	}

	/**
	 * 初始化C3P0参数
	 */
	private void initC3P0() {
		// 创建连接池实例
		CPDS = new ComboPooledDataSource();
		// 设置连接池连接数据库所需的驱动
		try {
			CPDS.setDriverClass(driver);
			// 设置连接数据库的URL
			CPDS.setJdbcUrl(url);
			// 设置连接数据库的用户名
			CPDS.setUser(user);
			// 设置连接数据库的密码
			CPDS.setPassword(password);
			// 设置连接池的最大连接数
			CPDS.setMaxPoolSize(20);
			// 设置连接池的最小连接数
			CPDS.setMinPoolSize(2);
			// 设置连接池的初始连接数
			CPDS.setInitialPoolSize(10);
			// 设置连接池缓存的Statement的最大数
			CPDS.setMaxStatements(100);
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			System.out.println("C3P0加载MySQL驱动失败");
			e.printStackTrace();
		}

	}

	/**
	 * 获取Connection，但不使用连接池管理Connection
	 * 
	 * @return 数据库连接
	 */
	public Connection getConnection() {
		try {
			// 加载驱动
			Class.forName(driver);
			connection = DriverManager.getConnection(DriverTool.getInstance().getUrl(),
					DriverTool.getInstance().getUser(), DriverTool.getInstance().getPassword());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("没有找到驱动，请检查项目的classpath中是否已经添加此驱动");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block

			if (e.getMessage().contains("Public Key Retrieval is not allowed")) {
				System.out.println("连接url后面需要加上allowPublicKeyRetrieval=true");
			} else {
				System.out.println("数据库连接失败");
			}
			e.printStackTrace();
		}
		return connection;
	}

	/**
	 * 获取数据库连接
	 * 
	 * @return the connection
	 */
	public Connection getConnection(String poolName) {
		// 不使用连接池管理Connection
		if (poolName == null) {
			getConnection();
		}

		// 使用DBCP连接池
		if (poolName.equals(DBCP)) {
			initDBCP();
			try {
				// 获取Connection
				connection = BDS.getConnection();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("使用DBCP连接池的方式获取Connection失败");
				e.printStackTrace();
			}
		}
		// 使用C3P0连接池
		if (poolName.equals(C3P0)) {
			initC3P0();
			try {
				// 获取Connection
				connection = CPDS.getConnection();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("使用C3P0连接池的方式获取Connection失败");
				e.printStackTrace();
			}
		}

		return connection;
	}

	/**
	 * 使用默认数据库连接
	 * 
	 * @param autoCommit 是否自动提交：false关闭自动提交，true开启自动提交
	 * @return 数据库连接
	 */
	public DriverTool useDefaultConnection(boolean autoCommit) {
		try {
			connection.setAutoCommit(autoCommit);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("开启事务失败");
		}
		return this;
	}

	/**
	 * 创建Statement
	 * 
	 * @return 返回新的Statement
	 */
	public Statement createStatement() {
		try {
			return connection.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("创建Statement失败");
		}
		return null;
	}

	/**
	 * 获取新的数据库连接
	 * 
	 * @return the connection
	 */
	public Connection getNewConnection() {
		initParam(paramFile);
		return connection;
	}

	/**
	 * 获取数据库信息的配置文件
	 * 
	 * @return 数据库信息的配置文件
	 */
	public static String getParamFile() {
		return paramFile;
	}

	/**
	 * 设置数据库信息的配置文件
	 * 
	 * @param paramFile 数据库信息的配置文件
	 */
	public static void setParamFile(String paramFile) {
		DriverTool.paramFile = paramFile;
	}

	/**
	 * 获取数据库的驱动名
	 * 
	 * @return 数据库的驱动名
	 */
	public String getDriver() {
		return driver;
	}

	/**
	 * 设置数据库的驱动名
	 * 
	 * @param driver 数据库的驱动名
	 */
	public void setDriver(String driver) {
		this.driver = driver;
	}

	/**
	 * 获取数据库的连接地址
	 * 
	 * @return 数据库的连接地址
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * 设置数据库的连接地址
	 * 
	 * @param url 数据库的连接地址
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * 获取数据库的用户
	 * 
	 * @return 数据库的用户
	 */
	public String getUser() {
		return user;
	}

	/**
	 * 设置数据库的用户
	 * 
	 * @param user 数据库的用户
	 */
	public void setUser(String user) {
		this.user = user;
	}

	/**
	 * 获取数据库用户的密码
	 * 
	 * @return 用户的密码
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * 设置数据库用户的密码
	 * 
	 * @param password 用户的密码
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * 关闭资源
	 */
	public void close() {
		// TODO Auto-generated method stub
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("关闭数据库连接失败");
			}
		}
		if (statement != null) {
			try {
				statement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("关闭statement失败");
			}
		}
	}
}
