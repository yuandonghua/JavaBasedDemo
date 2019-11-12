package fit.hrkj.exception;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * <br>
 * 2019年8月22日 上午10:30:32
 * 
 * @author 华软科技
 * @version 1.0
 */
public class FinallyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("b.txt");
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			// return语句强制方法返回
			return;// ①
			// 使用exit退出虚拟机
//			System.exit(1);//②
		} finally {
			// 关闭磁盘文件。回收资源
			if (fis != null) {
				try {
					fis.close();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
			System.out.println("执行finally块里的资源回收！");
		}
	}

}
