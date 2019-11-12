package fit.hrkj.date;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * <br>
 * 2019年6月12日 下午2:06:40
 * 
 * @author 华软科技
 * @version 1.0
 */
public class NewFormatterTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter[] formatter = new DateTimeFormatter[] {
				// 直接使用常量创建DateTimeFormatter格式器
				DateTimeFormatter.ISO_LOCAL_DATE, DateTimeFormatter.ISO_LOCAL_TIME,
				DateTimeFormatter.ISO_LOCAL_DATE_TIME,
				// 使用本地化的不同风格来创建DateTimeFormatter格式器
				DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.MEDIUM),
				DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG),
				// 根据模式字符串来创建DateTimeFormatter格式器
				DateTimeFormatter.ofPattern("Gyyyy-MM-dd HH:mm:ss") };

		LocalDateTime localTime = LocalDateTime.now();

		// 依次使用不同的格式器对LocalDateTime进行格式化
		for (int i = 0; i < formatter.length; i++) {
			// 下面两行代码的作用相同
			System.out.println(localTime.format(formatter[i]));
			System.out.println(formatter[i].format(localTime));
		}
	}

}
