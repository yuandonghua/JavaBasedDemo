package fit.hrkj.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <br>
 * 2019年5月29日 下午8:24:52
 * 
 * @author 华软科技
 * @version 1.0
 */
public class StartEnd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 创建一个Pattern对象,并用它建立一个Matcher对象
		String regStr = "java is very easy!";
		System.out.println("目标字符串是:" + regStr);
		Matcher matcher = Pattern.compile("\\w+").matcher(regStr);
		while (matcher.find()) {
			System.out.println(matcher.group() + "子串的起始位置: " + matcher.start() + ", 其结束位置: " + matcher.end());

		}
	}

}
