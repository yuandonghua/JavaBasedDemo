/**
 * 
 */
package fit.hrkj.gc;

/**
 * <br>
 * 2019年11月5日上午10:52:20
 * 
 * @author 华软科技
 * @version 1.0
 */
public class GcTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 4; i++) {
			new GcTest();
			// 下面两行的代码的作用完全相同,强制系统进行垃圾回收
//            System.gc();
			Runtime.getRuntime().gc();
		}

	}

	/* (non-Javadoc)
	 * @see java.lang.Object#finalize()
	 */
	@Override
	protected void finalize() throws Throwable {
		System.out.println("系统正在清理GcTest对象的资源...");
	}
}
