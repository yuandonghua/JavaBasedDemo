package fit.hrkj.object;

/**
 * 父类<br>
 * 2019年12月16日上午9:28:40
 * 
 * @author 华软科技
 * @version 1.0
 */
public class Base {
	/**
	 * 
	 * Description:构造器
	 */
	public Base() {
		test();
	}

	/**
	 * 
	 * Description:普通方法
	 */
	public void test() {// ①号test方法
		System.out.println("将被子类重写的方法");
	}
}
