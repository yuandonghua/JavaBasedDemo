package fit.hrkj.date;

import java.util.Date;

/**
 * <br>
 * 2019年5月27日 下午8:32:35
 * 
 * @author 华软科技
 * @version 1.0
 */
public class DateTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var d1 = new Date();
		// 获取当前时间之后100ms的时间
		var d2 = new Date(System.currentTimeMillis() + 100);
		System.out.println("d2: " + d2);
		System.out.println("d1.compareTo(d2): " + d2.compareTo(d1));
		System.out.println("d1.before(d2): " + d1.before(d2));
	}

}
