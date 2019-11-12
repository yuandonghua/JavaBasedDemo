package fit.hrkj.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * <br>
 * 2019年8月24日 下午1:56:23
 * 
 * @author 华软科技
 * @version 1.0
 */
public class ThrowsTest2 {

	/**
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		test();
	}

	public static void test() throws FileNotFoundException {
		// 因为FileInputStream的构造器声明抛出FileNotFoundException异常
		// 所以调用FileInputStream的代码要么处于try...catch块中
		// 要么处于另一个带throws声明抛出的方法中
		FileInputStream fis = new FileInputStream("a.txt");
	}
}
