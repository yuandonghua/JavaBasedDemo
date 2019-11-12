package fit.hrkj.exception;

/**
 * <br>
 * 2019年8月22日 上午11:00:41
 * 
 * @author 华软科技
 * @version 1.0
 */
public class FinallyTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result = test();
		System.out.println(result);
	}

	public static boolean test() {
		try {
			System.out.println("try代码块");
			// 因为finally块中包含了return语句
			// 所以下面的return语句失去作用
			return true;
		} finally {
			System.out.println("finally代码块");
			return false;
		}
	}

}
