package fit.hrkj.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <br>
 * 2019年5月29日 下午8:50:06
 * 
 * @author 华软科技
 * @version 1.0
 */
public class ReplaceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] mails = { "yuandonghua@hrkj.fit", "zhusiwei@hrkj.fit", "wangzhongyuan@hrkj.fit", "abc123@163.com",
				"1348474384@qq.com", "hrkj@abc.xx" };
		Pattern pattern=Pattern.compile("(abc|qq|163)\\.\\w*");
		Matcher matcher=null;
		for (int i = 0; i < mails.length; i++) {
			if (matcher==null) {
				matcher=pattern.matcher(mails[i]);
			}else {
				matcher.reset(mails[i]);
			}
			System.out.println(matcher.replaceAll("hrkj.fit"));
		}
		
	}

}
