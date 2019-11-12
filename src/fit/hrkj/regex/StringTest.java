package fit.hrkj.regex;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**<br>  
 * 2019年5月29日 下午9:00:31
 * @author 华软科技  
 * @version 1.0 
 */
public class StringTest {

	/**
	 * @param args 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] mails = { "yuandonghua@hrkj.fit", "zhusiwei@hrkj.fit", "wangzhongyuan@hrkj.fit", "abc123@163.com",
				"1348474384@qq.com", "hrkj@abc.xx" };
		Pattern pattern=Pattern.compile("(abc|qq|163)\\.\\w*");
		Matcher matcher=null;
		for (String email : mails) {
			System.out.println(email.replaceFirst("(abc|qq|163)\\.\\w*","hrkj.fit"));
			System.out.println(Arrays.toString(email.split("@")));
			
		}
		
	}

}
