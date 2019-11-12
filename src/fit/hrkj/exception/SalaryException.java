package fit.hrkj.exception;

/**
 * <br>
 * 2019年8月29日 下午3:14:25
 * 
 * @author 华软科技
 * @version 1.0
 */
public class SalaryException extends Exception {
	public SalaryException() {
	}

	public SalaryException(String msg) {
		super(msg);
	}

	// 创建一个可以接收Throwable参数的构造器
	public SalaryException(Throwable t) {
		super(t);
	}
}
