package fit.hrkj.date;

import java.util.Calendar;
import static java.util.Calendar.*;

/**
 * <br>
 * 2019年5月28日 下午7:17:01
 * 
 * @author 华软科技
 * @version 1.0
 */
public class LazyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c1 = Calendar.getInstance();
		c1.set(2000, 0, 31);// 2000-1-31
		// 将月份设为9,但9月31日不存在
		// 如果立即修改,系统将会把c1自动调整到10月1日
		c1.set(MONTH, 8);
		// 下面代码输出10月1日
//		System.out.println(c1.getTime());//①
		// 设置Date字段为5
		c1.set(DATE, 5);// ②
		System.out.println(c1.getTime());// ③

	}

}
