package fit.hrkj.scanner;

import java.util.Scanner;

/**
 * <br>
 * 2019年5月19日 下午8:29:35
 * 
 * @author 华软科技
 * @version 1.0
 */
public class ScannerLongTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// 判断是否还有下一个long型整数
		while (sc.hasNextLong()) {
			// 输出输入项
			System.out.println("键盘输入的内容是:" + sc.nextLong());
		}
		System.out.println("程序结束");
	}

}
