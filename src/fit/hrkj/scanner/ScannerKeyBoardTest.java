package fit.hrkj.scanner;

import java.util.Scanner;

/**
 * <br>
 * 2019年5月19日 下午8:07:01
 * 
 * @author 华软科技
 * @version 1.0
 */
public class ScannerKeyBoardTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入内容：");
		// System.in代表标准输入,就是键盘输入,java.util.Scanner
		Scanner sc = new Scanner(System.in);
		// 增加下面一行将只把回车作为分隔符
		sc.useDelimiter("\n");
		// 判断是否还有下一个输入项
		while (sc.hasNext()) {
			String content = sc.next();
			if (content.equals("exit\r")) {
				System.out.println("结束循环");
				break;
			}else {
				// 输出输入项
				System.out.println("键盘输入的内容是:" + content);
			}
		}
		System.out.println("阻塞");
	}

}
