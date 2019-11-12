package fit.hrkj.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

/**
 * <br>
 * 2019年8月22日 上午11:45:30
 * 
 * @author 华软科技
 * @version 1.0
 */
public class AutoCloseTest2 {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 有final修饰的资源
		final BufferedReader br = new BufferedReader(new FileReader("src/fit/hrkj/exception/AutoCloseTest2.java"));
		// 没有显式使用final修饰，但只要不对该变量重新赋值，该变量就是有效的final
		PrintStream ps = new PrintStream(new FileOutputStream("autoClose.txt"));
		// 只要将两个资源放在try后的圆括号内即可
		try (br; ps) {
			// 使用这两个资源
			String content;
			while ((content = br.readLine()) != null) {
				System.out.println(content);
				ps.println(content);
			}
		}
	}
}