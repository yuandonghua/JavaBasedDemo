package fit.hrkj.exception;

/**
 * <br>
 * 2019年8月29日 下午7:38:51
 * 
 * @author 华软科技
 * @version 1.0
 */
public class PrintStackTraceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			firstMethod();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("出现了异常，已经处理");
		}
		
		System.out.println("异常后面逻辑");
	}

	public static void firstMethod() {
		secondMethod();
	}

	public static void secondMethod() {
		thirdMethod();
	}

	public static void thirdMethod() {
		throw new SelfException("自定义异常信息");
	}

}

class SelfException extends RuntimeException {
	/**
	 * 
	 */
	public SelfException() {
		// TODO Auto-generated constructor stub
	}

	SelfException(String msg) {
		super(msg);
	}
}