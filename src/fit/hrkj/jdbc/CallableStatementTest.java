package fit.hrkj.jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Properties;

/**
 * 演示调用存储过程<br>
 * 2019年11月15日上午11:35:09
 * 
 * @author 华软科技
 * @version 1.0
 */
public class CallableStatementTest {
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
     * 程序入口
     * 
     * @param args 入口参数
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        CallableStatementTest cst = new CallableStatementTest();
        cst.initParam(paramFile);
        cst.callProcedure();

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
     * 调用存储过程
     */
    public void callProcedure() {
        try (
                // 获取数据库连接
                Connection connection = DriverManager.getConnection(url, user, password);
                // 使用connection来创建一个CallableStatement对象
                CallableStatement prepareCall = connection.prepareCall("{call add_pro(?,?,?)}");) {
            prepareCall.setInt(1, 4);
            prepareCall.setInt(2, 6);
            // 注册CallableStatement的第三个参数是int类型（java.sql.Types）
            prepareCall.registerOutParameter(3, Types.INTEGER);
            // 执行存储过程
            prepareCall.execute();
            // 获取并输出存储过程传出参数的值
            System.out.println("执行结果是：" + prepareCall.getInt(3));
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}