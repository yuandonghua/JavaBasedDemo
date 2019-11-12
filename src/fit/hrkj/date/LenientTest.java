package fit.hrkj.date;

import java.util.Calendar;
import static java.util.Calendar.*;

/**
 * <br>
 * 2019年5月28日 下午5:22:40
 * 
 * @author 华软科技
 * @version 1.0
 */
public class LenientTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c1 = Calendar.getInstance();
		c1.set(MONTH, 13);// ①
		System.out.println(c1.getTime());
		// 关闭容错性
		c1.setLenient(false);
		// 导致运行时异常
		c1.set(MONTH, 13);// ②
		System.out.println(c1.getTime());
	}

}
