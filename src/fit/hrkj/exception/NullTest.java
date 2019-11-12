package fit.hrkj.exception;

import java.util.Date;

/**
 * <br>
 * 2019年8月18日 上午11:23:07
 * 
 * @author 华软科技
 * @version 1.0
 */
public class NullTest {
	public static void main(String[] args) {
		Date d = null;
		try {
			System.out.println(d.after(new Date()));

		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("空指针异常");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("未知异常");
		}
	}

}
