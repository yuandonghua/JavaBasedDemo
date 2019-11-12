package fit.hrkj.method;

/**
 * 方法重载<br>
 * 2019年8月13日 下午2:40:15
 * 
 * @author 华软科技
 * @version 1.0
 */
public class Overload {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test(1, 2,3);
		test1(1, 2,3);
		
		
		
	}

	public static int test(String a) {
		System.out.println("test...");
		return 1;
	}

	public static void test(int b) {
		System.out.println("test...");
	}

	public static void test(int b, int a,int c) {
		System.out.println("test(int b, int a)");
	}
	public static void test1(int b,int... a) {
		System.out.println("test(int b,int... a)");
	}
}
