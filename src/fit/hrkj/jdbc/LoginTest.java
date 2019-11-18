package fit.hrkj.jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * 系统通过用户输入的账号密码与user表里的记录进行匹配，如果找到相应记录则提示登录成功<br>
 * 演示SQL注入<br>
 * 2019年11月13日下午5:02:39
 * 
 * @author 华软科技
 * @version 1.0
 */
public class LoginTest {
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
     * 建表sql语句
     */
    private static String sql = "create table  user " + "(" + "id int auto_increment primary key,"
            + "name varchar(255)," + "password varchar(255)," + "age int" + ");";
    /**
     * 用户名
     */
    private static String userName = "yuandonghua@hrkj.fit";
    /**
     * 密码
     */
    private static String userPassword = "1234qwer";

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        LoginTest lt = new LoginTest();
        lt.initParam(paramFile);
        lt.createTable(sql);
        lt.insertUsePreparedStatement(userName, userPassword);

        // Statement方式 正常登录
        boolean login1 = lt.loginByStatement(userName, userPassword);
        if (login1) {
            System.out.println("Statement方式校验成功，欢迎使用MySQL数据库！");
        } else {
            System.out.println("Statement方式校验失败，请重新登录...");

        }

        System.out.println("\n开始SQL注入-----------------\n");
        // Statement方式SQL注入登录
//        boolean result = lt.login("' or true  -- '", "");
//        boolean result = lt.login("' or true ## '", "");
        boolean login2 = lt.loginByStatement("' or true or '", "");
        if (login2) {
            System.out.println("Statement方式校验成功，欢迎使用MySQL数据库！");
        } else {
            System.out.println("Statement方式校验失败，请重新登录...");

        }
        System.out.println("\n\n=============================\n\n");
        // PreparedStatement方式 正常登录
        boolean login3 = lt.loginByPreparedStatement(userName, userPassword);
        if (login3) {
            System.out.println("PreparedStatement方式校验成功，欢迎使用MySQL数据库！");
        } else {
            System.out.println("PreparedStatement方式校验失败，请重新登录...");

        }

        System.out.println("\n开始SQL注入-----------------\n");
        // PreparedStatement方式SQL注入登录
//                boolean result = lt.login("' or true  -- '", "");
//                boolean result = lt.login("' or true ## '", "");
        boolean login4 = lt.loginByPreparedStatement("' or true or '", "");
        if (login4) {
            System.out.println("PreparedStatement方式校验成功，欢迎使用MySQL数据库！");
        } else {
            System.out.println("PreparedStatement方式校验失败，请重新登录...");

        }
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
        try {
            // 加载驱动
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("没有找到驱动，请检查项目的classpath中是否已经添加此驱动");
        }
    }

    /**
     * 使用Statement插入数据
     * 
     * @param userName     用户名
     * @param userPassword 密码
     */
    public void insertUsePreparedStatement(String userName, String userPassword) {
        try (
                // 获取数据库连接
                Connection connection = DriverManager.getConnection(url, user, password);
                // 使用connection来创建一个PreparedStatement对象
                PreparedStatement ps = connection.prepareStatement("insert into user(name,password) values(?,?)");) {
            // 插入count条记录
            ps.setString(1, userName);
            ps.setString(2, userPassword);
            int executeUpdate = ps.executeUpdate();
            if (executeUpdate == 1) {
                System.out.println("数据插入成功");
            } else {
                System.out.println("数据插入失败");

            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            if (e.getMessage().contains("Duplicate entry")) {
                System.out.println("账号已存在，添加失败");
            }
        }

    }

    /**
     * 通过Statement查询用户是否匹配
     * 
     * @param userName     用户名
     * @param userPassword 密码
     * @return 是否登录成功
     */
    public boolean loginByStatement(String userName, String userPassword) {
        // 执行查询的SQL语句
        String sql = "select * from user where name='" + userName + "' and password='" + userPassword + "' ";
        System.out.println("SQL语句：" + sql);
        try (
                // 获取数据库连接
                Connection connection = DriverManager.getConnection(url, user, password);
                // 使用connection来创建一个Statement对象
                Statement statement = connection.createStatement();
                // 执行查询
                ResultSet rs = statement.executeQuery(sql);) {
            // 如果查询的ResultSet里有超过一条的记录，则登录成功
            if (rs.next()) {
                return true;
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            System.out.println("数据查询失败");
            e.printStackTrace();
        }
        // 登录失败
        return false;
    }

    /**
     * 通过PreparedStatement查询用户是否匹配
     * 
     * @param userName     用户名
     * @param userPassword 密码
     * @return 是否登录成功
     */
    public boolean loginByPreparedStatement(String userName, String userPassword) {
        String sql = "select * from user where name=? and password=?";
        System.out.println("SQL语句：" + sql);
        try (
                // 获取数据库连接
                Connection connection = DriverManager.getConnection(url, user, password);
                // 使用connection来创建一个PreparedStatement对象
                PreparedStatement ps = connection.prepareStatement(sql);) {
            // 插入count条记录
            ps.setString(1, userName);
            ps.setString(2, userPassword);
            ResultSet resultSet = ps.executeQuery();
            // 如果查询的ResultSet里有超过一条记录，则登录成功
            if (resultSet.next()) {
                return true;
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            if (e.getMessage().contains("Duplicate entry")) {
                System.out.println("账号已存在，添加失败");
            }
        }
        return false;
    }

    /**
     * 建表
     * 
     * @param sql 建表语句
     */
    public void createTable(String sql) {
        try (
                // 获取数据库连接
                Connection connection = DriverManager.getConnection(url, user, password);
                // 使用connection来创建一个Statement对象
                Statement statement = connection.createStatement();) {
            // 执行DDL语句，创建数据表
            int result = statement.executeUpdate(sql);
            System.out.println("创建成功");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            if (e.getMessage().contains("already exists")) {
                System.out.println("表已存在，创建失败");
            }
        }
    }
}