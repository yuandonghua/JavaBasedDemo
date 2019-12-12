package fit.hrkj.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 演示通过DatabaseMetaData分析当前Connection连接对应数据库的一些信息<br>
 * 2019年12月4日下午7:53:46
 * 
 * @author 华软科技
 * @version 1.0
 */
public class DatabaseMetaDataTest {
	/**
	 * 程序入口
	 * 
	 * @param args 入口参数
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DatabaseMetaDataTest dmdt = new DatabaseMetaDataTest();
		dmdt.info();
	}

	public void info() {
		Connection connection = DriverTool.getInstance().getConnection();
		try {
			// 获取DatabaseMetaData对象
			DatabaseMetaData metaData = connection.getMetaData();
			ResultSet rs = metaData.getTableTypes();
			TableFormatter.showHeader(rs);
			TableFormatter.showBodyAll();
			TableFormatter.showFooter();
			// 获取当前数据库的全部数据表,第一个参数是数据库的名字
			rs = metaData.getTables("hrkj", null, "%", new String[] { "table" });
			TableFormatter.showHeader(rs);
			TableFormatter.showBodyAll();
			TableFormatter.showFooter();
			// 获取user表的主键
			rs = metaData.getPrimaryKeys("hrkj", null, "user");
			TableFormatter.showHeader(rs);
			TableFormatter.showBodyAll();
			TableFormatter.showFooter();
			// 获取当前数据库的全部存储过程
			rs = metaData.getProcedures("hrkj", null, "%");
			TableFormatter.showHeader(rs);
			TableFormatter.showBodyAll();
			TableFormatter.showFooter();
			// 获取teacher表和student表之间的约束
			rs = metaData.getCrossReference("hrkj", null, "teacher", null, null, "student");
			TableFormatter.showHeader(rs);
			TableFormatter.showBodyAll();
			TableFormatter.showFooter();
			// 获取user表的全部数据列
			rs = metaData.getColumns("hrkj", null, "user", "%");
			TableFormatter.showHeader(rs);
			TableFormatter.showBodyAll();
			TableFormatter.showFooter();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("获取数据库信息失败");
			e.printStackTrace();
		}
	}
}
