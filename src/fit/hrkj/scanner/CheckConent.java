/**
 * 
 */
package fit.hrkj.scanner;

import java.util.Scanner;

/**
 * 检查输入的内容是否是数字(非正则表达式)<br>
 * 2019年11月12日下午6:03:15
 * 
 * @author 华软科技
 * @version 1.0
 */
public class CheckConent {
	// 是否出现非法字符
	private static boolean error = false;
	// 记录小数点个数
	private static int dot = 0;
	// 记录负号的个数
	private static int minus = 0;

	/**
	 * 程序入口
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 创建扫描器
		Scanner scanner = new Scanner(System.in);
		System.out.println("退出程序输入exit");
		System.out.println("请输入合法的数字");
		System.out.println("输入完毕请按回车键！");

		outer: while (scanner.hasNextLine()) {
			// 获取输入的内容
			String content = scanner.nextLine();
			// 输入内容不能为空
			if (content.isEmpty()) {
				System.out.println("输入内容不能为空");
				continue;
			} else if (content.equals("exit")) {
				System.out.println("如果要退出程序，请给★★★★★好评");
				continue;
			} else if (content.equals("★★★★★")) {
				System.out.println("欢迎您下次使用！");
				break;
			}
			// 把获取到的内容转换成字符数组，也可以转成byte[]
			char[] chars = content.toCharArray();
			// 分析每个字符是否合法
			for (char c : chars) {
				System.out.println((int) c);
				// 与负号的编号相比较
				if (c == 45) {
					minus++;

				} else if (c == 46) {
					// 与小数点编号比较
					dot++;

				} else if (c < 48 || c > 57) {
					// 与0-9的编号比较，字符不合法
					error = true;
					System.out.println("请重新输入，因为出现了非法字符串:" + content);
					// 重置判断条件
					resetCondition();
					continue outer;
				}
			}
			// 输入内容合法
			if (!error && dot <= 1 && minus <= 1) {
				// 检查输入内容不合法则跳过本次循环
				boolean skip = checkSymbol(content);
				if (skip) {
					continue;
				}
				// 转成数字
				double parseDouble = Double.parseDouble(content);
				System.out.println("获取到数字：" + parseDouble);
			} else {
				System.out.println("请重新输入，因为出现了非法字符串:" + content);
			}
			// 重置判断条件
			resetCondition();
		}
		// 关闭扫描器
		scanner.close();
	}

	/**
	 * 重置判断条件,进行下次输入
	 */
	private static void resetCondition() {
		error = false;
		dot = 0;
		minus = 0;
	}

	/**
	 * 检查出现的负号和小数点
	 * 
	 * @return 是否跳过循环
	 */
	public static boolean checkSymbol(String content) {
		boolean result = false;
		if (content.startsWith("-") && content.endsWith(".")) {
			System.out.println("请重新输入，因为出现了非法字符串:" + content);
			// 重置判断条件
			resetCondition();
			result = true;
		} else if (content.startsWith(".") && content.endsWith("-")) {
			System.out.println("请重新输入，因为出现了非法字符串:" + content);
			// 重置判断条件
			resetCondition();
			result = true;
		} else if (!content.startsWith("-") && content.contains("-")) {
			System.out.println("请重新输入，因为出现了非法字符串:" + content);
			// 重置判断条件
			resetCondition();
			result = true;
		} else if (dot == 1 && content.length() == 1) {

			// 只有一个小数点
			System.out.println("请重新输入，因为出现了非法字符串:" + content);
			// 重置判断条件
			resetCondition();
			result = true;
		} else if (minus == 1 && content.length() == 1) {
			System.out.println("请重新输入，因为出现了非法字符串:" + content);
			// 重置判断条件
			resetCondition();
			result = true;
		}
		return result;
	}
}
