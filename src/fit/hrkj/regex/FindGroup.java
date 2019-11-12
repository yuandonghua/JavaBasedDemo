package fit.hrkj.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <br>
 * 2019年5月29日 下午6:24:45
 * 
 * @author 华软科技
 * @version 1.0
 */
public class FindGroup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 使用字符串模拟从网络上得到的网页源码
		String str = "想学<<全栈工程师>>课程的同学,尽快联系我:18538326726" + "交朋友,电话号码是:18838305879" + "服务器租赁,联系方式:18838305879";
		// 创建一个Pattern对象,并用它建立一个Matcher对象
		// 该正则表达式只抓取185X和188X段的手机号
		// 实际要抓取哪些电话号码,只要修改正则表达式即可
		Matcher matcher = Pattern.compile("((185\\d)|(188\\d))\\d{7}").matcher(str);
		// 将所有符合正则表达式的子串(电话号码)全部输出

		while (matcher.find()) {
			System.out.println(matcher.group());

		}
	}

}
