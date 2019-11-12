package fit.hrkj.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <br>
 * 2019年5月29日 下午8:34:22
 * 
 * @author 华软科技
 * @version 1.0
 */
public class MatchesTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] mails = { "yuandonghua@hrkj.fit", "zhusiwei@hrkj.fit", "wangzhongyuan@hrkj.fit", "abc123@163.com",
				"1348474384@qq.com", "123qwe@abc.xx" };
		String mailRegEx = "\\w{3,20}@\\w+\\.(fit|com)";
		Pattern pattern = Pattern.compile(mailRegEx);
		Matcher matcher = null;
		for (String mail : mails) {
			if (matcher == null) {
				matcher = pattern.matcher(mail);
			} else {
				matcher.reset(mail);
			}
			String result = mail + (matcher.matches() ? "是" : "不是") + "一个有效的邮件地址";
			System.out.println(result);
		}
		
		
	}

}
