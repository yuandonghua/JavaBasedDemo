package fit.hrkj.jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * 演示使用Statement和PreparedStatement分别插入10条记录<br>
 * 2019年11月11日下午9:35:34
 * 
 * @author 华软科技
 * @version 1.0
 */
public class PreparedStatementTest {
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
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        PreparedStatementTest pst = new PreparedStatementTest();
        pst.initParam(paramFile);
        pst.insertUseStatement(10);
        pst.insertUsePreparedStatement(10);

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
     * 使用Statement插入count条数据
     * 
     * @param count 条数
     */
    public void insertUseStatement(int count) {
        // 开始时间
        long startTimeMillis = System.currentTimeMillis();

        try (
                // 获取数据库连接
                Connection connection = DriverManager.getConnection(url, user, password);
                // 使用connection来创建一个Statement对象
                Statement statement = connection.createStatement();) {
            // 插入count条记录
            for (int i = 1; i <= count; i++) {
                String name = "statement" + i;
                String sql = "insert into jdbc_test(name,age)  values" + "('" + name + "'," + i + ");";
                statement.executeUpdate(sql);
            }
            // 结束时间
            long endTimeMillis = System.currentTimeMillis();
            System.out.println("insertUseStatement总耗时：" + (startTimeMillis - endTimeMillis));

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            System.out.println("数据添加失败");
            e.printStackTrace();
        }

    }

    /**
     * 使用Statement插入count条数据
     * 
     * @param count 条数
     */
    public void insertUsePreparedStatement(int count) {
        // 开始时间
        long startTimeMillis = System.currentTimeMillis();

        try (
                // 获取数据库连接
                Connection connection = DriverManager.getConnection(url, user, password);
                // 使用connection来创建一个PreparedStatement对象
                PreparedStatement ps = connection.prepareStatement("insert into jdbc_test(name,age) values(?,?)");) {
            // 插入count条记录
            for (int i = 1; i <= count; i++) {
                ps.setString(1, "ps" + i);
                ps.setInt(2, i);
                ps.executeUpdate();
            }
            // 结束时间
            long endTimeMillis = System.currentTimeMillis();
            System.out.println("insertUsePreparedStatement总耗时：" + (startTimeMillis - endTimeMillis));

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            System.out.println("数据添加失败");
            e.printStackTrace();
        } finally {
        }

    }
}