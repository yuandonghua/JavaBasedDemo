package fit.hrkj.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 测试Blob<br>
 * 2019年11月23日下午8:17:51
 * 
 * @author 华软科技
 * @version 1.0
 */
public class BlobTest {
	/**
	 * 插入一条记录的SQL语句
	 */
	private static String insertSql = "insert into image values(null,?,?)";
	/**
	 * 查询一条记录的SQL语句
	 */
	private static String selectSql = "select data from image where id=?";
	/**
	 * 查询所有记录的SQL语句
	 */
	private static String selectAllSql = "select * from image";

	/**
	 * 程序入口
	 * 
	 * @param args 入口参数
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Connection connection = DriverTool.getInstance().getConnection();
				// 创建执行插入的PreparedStatement
				// 该对象执行插入后可以返回自动生成的主键
				PreparedStatement insert = connection.prepareStatement(insertSql, Statement.RETURN_GENERATED_KEYS);
				// 创建两个PreparedStatement对象，用于查询指定图片，查询所有图片
				PreparedStatement query = connection.prepareStatement(selectSql);
				PreparedStatement queryAll = connection.prepareStatement(selectAllSql);) {
			// 设置name列的值
			insert.setString(1, "logo");
			// 创建一个文件
			File file = new File("./images/logo.jpg");
			// 把文件转成文件输入流
			FileInputStream fis = new FileInputStream(file);
			// 把文件输入流保存到data列
			insert.setBinaryStream(2, fis, file.length());
			int affect = insert.executeUpdate();
			if (affect == 1) {
				System.out.println("图片插入成功");
			} else {
				System.out.println("图片插入失败");
			}
			// 设置查询条件的id值
			query.setInt(1, 1);
			ResultSet rs = query.executeQuery();
			if (rs.next()) {
				// 取出Blob列
				Blob blob = rs.getBlob(1);
				if (blob != null) {
					System.out.println("查询到图片");
				}
			}
			// 查询所有记录
			ResultSet rsAll = queryAll.executeQuery();
			// 用表格格式化器展示整个表格
			TableFormatter.showHeader(30, rsAll);
			TableFormatter.showBodyAll();
			TableFormatter.showFooter();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("没有找到要插入的文件");
		}
	}
}
