package fit.hrkj.date;

import java.time.Clock;

/**
 * 演示clock用法<br>
 * 2019年12月5日下午2:52:22
 * 
 * @author 华软科技
 * @version 1.0
 */
public class ClockTest {
	/**
	 * 程序入口
	 * 
	 * @param args 入口参数
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clock systemUTC = Clock.systemUTC();
		long currentTimeMillis1 = systemUTC.millis();
		long currentTimeMillis2 = System.currentTimeMillis();
		System.out.println("currentTimeMillis1:"+currentTimeMillis1);
		System.out.println("currentTimeMillis2:"+currentTimeMillis2);
		

	}
}
