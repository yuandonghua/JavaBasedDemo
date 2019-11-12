package fit.hrkj.exception;

/**
 * <br>
 * 2019年8月30日 下午5:14:15
 * 
 * @author 华软科技
 * @version 1.0
 */
public class ThreadExceptionTest implements Runnable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(new ThreadExceptionTest()).start();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		firstMethod();
	}

	public void firstMethod() {
		secondMethod();
	}

	public void secondMethod() {
		int a = 5;
		int b = 0;
		int c = a / b;
	}

}
