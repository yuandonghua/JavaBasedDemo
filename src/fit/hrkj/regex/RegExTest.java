package fit.hrkj.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <br>
 * 2019年5月29日 下午2:33:17
 * 
 * @author 华软科技
 * @version 1.0
 */
public class RegExTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello , java!";
		// 贪婪模式的正则表达式
		System.out.println(str.replaceFirst("\\w*", "8"));
		// 勉强模式的正则表达式
		System.out.println(str.replaceFirst("\\w*?", "8"));
		
		//将一个字符串编译成Pattern对象
		Pattern pattern=Pattern.compile("a*b");
		//使用Pattern对象创建Matcher对象
		Matcher matcher=pattern.matcher("aaaaaaab");
		boolean b=matcher.matches();
		System.out.println(b);
		
		
	}

}
