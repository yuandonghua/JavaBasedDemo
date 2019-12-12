package fit.hrkj.test;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;


/**
 * 2019年12月11日下午4:10:23<br>
 * 
 * @author 贾洪真
 * @version 1.1
 */
public class RowSetTest {
	/**
	 * 程序入口
	 * 
	 * @param args 运行参数(null)
	 */
	public static void main(String[] args) {
		// 使用RowSetProvider创建RowSetFactory
		RowSetFactory factory = null;
		try {
			factory = RowSetProvider.newFactory();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("创建工厂类失败");
			e.printStackTrace();
		}
//		boolean isloaded = DriverTool.getInstance().loadDriver();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			System.out.println("驱动加载失败");
			e1.printStackTrace();
			
		}
			try (
					//jdbc:mysql://127.0.0.1:3306/hrkj?useSSL=false&serverTimezone=UTC
				JdbcRowSet jrs = factory.createJdbcRowSet();) {
				jrs.setUrl("jdbc:mysql://localhost:3306/hrkj?user=root&useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true");
//				jrs.setUrl("jdbc:mysql://localhost:3306/jhz?user=jhz&password=jhz-199339&serverTimezone=UTC");

//				jrs.setUsername("root");
				jrs.setPassword("1234qwer");
				jrs.setCommand("select * from user");
//				jrs.setInt(1, 2);
				jrs.execute();
				TableFormatter tf = new TableFormatter(jrs);
				tf.showResult();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("发生了异常");
				e.printStackTrace();
			}
//		}else {
//			System.out.println("数据库加载失败");
//		}

	}

}
