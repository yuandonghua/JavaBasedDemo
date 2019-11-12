package fit.hrkj.exception;

/**
 * <br>
 * 2019年8月28日 下午5:47:01
 * 
 * @author 华软科技
 * @version 1.0
 */
public class AuctionException extends Exception {
	// 无参数的构造器
	public AuctionException() {// ①
		// TODO Auto-generated constructor stub
	}

	// 带一个字符串参数的构造器
	public AuctionException(String msg) {// ②
		// TODO Auto-generated constructor stub
		super(msg);
	}

}
