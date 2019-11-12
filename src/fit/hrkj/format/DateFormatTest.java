package fit.hrkj.format;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;
import static java.text.DateFormat.*;

/**
 * <br>
 * 2019年6月11日 上午10:30:12
 * 
 * @author 华软科技
 * @version 1.0
 */
public class DateFormatTest {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		// 需要被格式化的时间
		Date date = new Date();
		// 创建两个Locale,分别代表中国,美国
		Locale[] locales = { Locale.CHINA, Locale.US };
		DateFormat[] df = new DateFormat[16];
		// 为上面两个Locale创建16个DateFormat对象
		for (int i = 0; i < locales.length; i++) {
			df[i * 8] = DateFormat.getDateInstance(SHORT, locales[i]);
			df[i * 8 + 1] = DateFormat.getDateInstance(MEDIUM, locales[i]);
			df[i * 8 + 2] = DateFormat.getDateInstance(LONG, locales[i]);
			df[i * 8 + 3] = DateFormat.getDateInstance(FULL, locales[i]);
			df[i * 8 + 4] = DateFormat.getTimeInstance(SHORT, locales[i]);
			df[i * 8 + 5] = DateFormat.getTimeInstance(MEDIUM, locales[i]);
			df[i * 8 + 6] = DateFormat.getTimeInstance(LONG, locales[i]);
			df[i * 8 + 7] = DateFormat.getTimeInstance(FULL, locales[i]);
		}
		for (int i = 0; i < locales.length; i++) {
			String tip = i == 0 ? "----中国日期格式----" : "----美国日期格式----";
			System.out.println(tip);
			System.out.println("SHORT格式的日期格式:" + df[i * 8].format(date));
			System.out.println("MEDIUM格式的日期格式:" + df[i * 8 + 1].format(date));
			System.out.println("LONG格式的日期格式:" + df[i * 8 + 2].format(date));
			System.out.println("FULL格式的日期格式:" + df[i * 8 + 3].format(date));
			System.out.println("SHORT格式的时间格式:" + df[i * 8 + 4].format(date));
			System.out.println("MEDIUM格式的时间格式:" + df[i * 8 + 5].format(date));
			System.out.println("LONG格式的时间格式:" + df[i * 8 + 6].format(date));
			System.out.println("FULL格式的时间格式:" + df[i * 8 + 7].format(date));
		}

		String str1 = "2019/6/11";
		String str2="2019年6月11日";
		System.out.println(DateFormat.getDateInstance().parse(str2));
		System.out.println(DateFormat.getDateInstance(SHORT).parse(str1));
		System.out.println(DateFormat.getDateInstance().parse(str1));
	}

}
