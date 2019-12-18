package fit.hrkj.annotation;

/**
 * 使用@Testable注解标记一些方法是可测试的<br>
 * 2019年12月17日下午8:20:48
 * 
 * @author 华软科技
 * @version 1.0
 */
public class MyTest {
	/**
	 * 使用@Testable注解指定该方法是可测试的
	 */
	@Testable
	public static void m1() {

	}

	public static void m2() {

	}

	/**
	 * 使用@Testable注解指定该方法是可测试的
	 */
	@Testable
	public static void m3() {
		throw new IllegalArgumentException("参数出错了！");
	}

	public static void m4() {

	}

	/**
	 * 使用@Testable注解指定该方法是可测试的
	 */
	@Testable
	public static void m5() {

	}

	public static void m6() {

	}

	/**
	 * 使用@Testable注解指定该方法是可测试的
	 */
	@Testable
	public static void m7() {
		throw new RuntimeException("程序业务逻辑出现了异常！");
	}

	public static void m8() {

	}
}
