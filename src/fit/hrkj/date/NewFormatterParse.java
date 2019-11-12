package fit.hrkj.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**<br>  
 * 2019年6月12日 下午2:31:58
 * @author 华软科技  
 * @version 1.0 
 */
public class NewFormatterParse {

	/**
	 * @param args 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义一个任意格式的日期,时间字符串
		String str="2019==06==12 1时06分9秒";
		//根据需要解析的日期,时间字符串定义所用的格式器
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy==MM==dd H时mm分s秒");
		//执行解析
		LocalDateTime localDateTime=LocalDateTime.parse(str,formatter);
		//输出2019-06-12T01:06:09
		System.out.println(localDateTime);
		
		//下面代码再次解析另一个字符串
		String str2="2019$$$6月$$$13 20 小时";
		DateTimeFormatter formatter2=DateTimeFormatter.ofPattern("yyyy$$$MMM$$$dd HH 小时");
		LocalDateTime localDateTime2=LocalDateTime.parse(str2,formatter2);
		//输出2019-06-13T20:00
		System.out.println(localDateTime2);
	}

}
