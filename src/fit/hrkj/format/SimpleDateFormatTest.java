package fit.hrkj.format;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * <br>
 * 2019年6月11日 下午8:31:33
 * 
 * @author 华软科技
 * @version 1.0
 */
public class SimpleDateFormatTest {

	/**
	 * @param args
	 * @throws ParseException
	 */
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Date d = new Date();
		SimpleDateFormat simple = new SimpleDateFormat("Gyyyy年中第D天");
		// 将d格式化成日期
		String dateString = simple.format(d);
		System.out.println(dateString);
		// 一个非常特殊的日期字符串
		String str = "14###3月##21";
		SimpleDateFormat simple2 = new SimpleDateFormat("y###MMM##d");
		SimpleDateFormat simple3 = new SimpleDateFormat("yyyy-MM 月 dd hh:mm:ss");

		// 将日期字符串解析成日期
		System.out.println(simple3.format(simple2.parse(str)));
	}

}
