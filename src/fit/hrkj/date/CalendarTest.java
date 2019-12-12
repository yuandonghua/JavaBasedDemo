package fit.hrkj.date;

import java.util.Calendar;
import static java.util.Calendar.*;

/**
 * <br>
 * 2019年5月28日 上午10:15:44
 * 
 * @author 华软科技
 * @version 1.0
 */
public class CalendarTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
		// 取出年
		System.out.println(c.get(YEAR));
		// 取出月
		System.out.println(c.get(MONTH));
		// 取出日
		System.out.println(c.get(DATE));
		// 分别设置年月日时分秒
		c.set(2019, 4, 28, 11, 11, 11);
		System.out.println(c.getTime());
		// 将Calendar的年前推1年
		c.add(YEAR, -1);
		System.out.println(c.getTime());
		// 将Calendar的月前推8个月
		c.add(MONTH, -8);
		System.out.println(c.getTime());
		
		Calendar c1 = Calendar.getInstance();
		c1.set(2000, 1, 1, 0, 0, 0);
		System.out.println("修改前: "+c1.getTime());
		c1.add(MONTH, 16);
		System.out.println("修改后: "+c1.getTime());
		
		
		Calendar c2 = Calendar.getInstance();
		c2.set(2000, 0, 31, 0, 0, 0);
		System.out.println("修改前: "+c2.getTime());
		c2.add(MONTH, 1);
		System.out.println("修改后: "+c2.getTime());
		
		Calendar c3 = Calendar.getInstance();
		c3.set(2000, 0, 31, 0, 0, 0);
		System.out.println("修改前: "+c3.getTime());
		c3.roll(MONTH, 13);
		System.out.println("修改后: "+c3.getTime());
		
		Calendar c4 = Calendar.getInstance();
		c4.set(2000, 0, 31, 0, 0, 0);
		System.out.println("修改前: "+c4.getTime());
		c4.roll(MONTH, 13);
		System.out.println("修改后: "+c4.getTime());
		int actualMaximum = c4.getActualMaximum(HOUR_OF_DAY);
		System.out.println("actualMaximum:"+actualMaximum);
		
		
		
		Calendar c5 = Calendar.getInstance();
		c5.set(2000, 0, 31, 0, 0, 0);
		System.out.println("修改前: "+c5.getTime());
		c5.add(DATE, 1);
		System.out.println("修改后: "+c5.getTime());
		
		
	}
}
