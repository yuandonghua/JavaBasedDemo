package fit.hrkj.exception;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

/**
 * <br>
 * 2019年8月22日 上午11:28:43
 * 
 * @author 华软科技
 * @version 1.0
 */
public class AutoCloseTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (
				// 声明、初始化两个可关闭的资源
				// try语句会自动关闭这两个资源
				BufferedReader br = new BufferedReader(new FileReader("src/fit/hrkj/exception/AutoCloseTest.java"));
				PrintStream ps = new PrintStream(new FileOutputStream("b.txt"));) {
			// 使用这两个资源
			String content = br.readLine();
			System.out.println(content);
			ps.println(content);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("catch块");
		}
	}

}
