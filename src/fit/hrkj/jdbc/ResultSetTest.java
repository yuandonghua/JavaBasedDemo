package fit.hrkj.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * <br>
 * 2019年11月19日下午8:38:40
 * 
 * @author 华软科技
 * @version 1.0
 */
public class ResultSetTest {
	private static String sql = "select * from user";

	/**
	 * 程序入口
	 * 
	 * @param args 入口参数
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DriverTool.getInstance();
		ResultSetTest rst = new ResultSetTest();
		rst.query(sql);
	}

	/**
	 * 查询方法
	 * 
	 * @param sql 查询语句
	 */
	public void query(String sql) {
		try (Connection connection = DriverManager.getConnection(DriverTool.getInstance().getUrl(),
				DriverTool.getInstance().getUser(), DriverTool.getInstance().getPassword());
				// 使用Connection来创建一个PreparedStatement对象
				// 传入控制结果集可滚动、可更新的参数
				PreparedStatement prepareStatement = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE,
						ResultSet.CONCUR_UPDATABLE);
				ResultSet rs = prepareStatement.executeQuery();) {
			// 把指针移到最后一行
			rs.last();
			int rowCount = rs.getRow();
			System.out.println("rowCount:" + rowCount);
			TableFormatter.showHeader(rs);
			for (int i = rowCount; i > 0; i--) {
				// 把指针移动到第i行
				boolean absolute = rs.absolute(i);
				//修改第4列age
				rs.updateString(4, 10 + i + "");
//				// 提交修改
				rs.updateRow();
				TableFormatter.showBody();
			}
			TableFormatter.showFooter();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("出现异常");
		}

	}

}
