/**
 * 
 */
package fit.hrkj.gc;

/**
 * <br>
 * 2019年5月6日 上午8:55:27
 * 
 * @author 华软科技
 * @version 1.0
 */
public class FinalizeTest {
	private static FinalizeTest ft = null;

	public void info() {
		System.out.println("测试资源清理的finalize方法");
	}

	public void finalize() {
		System.out.println("进入了finalize");
		// 让ft引用到试图回收的可恢复对象,即可恢复对象重新变成可达
		ft = this;
		if (ft == null) {
			System.out.println("ft为空1");
		} else {
			System.out.println("ft不为空");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 创建FinalizeTest对象立即进入可恢复状态
		new FinalizeTest();
		// 通知系统进行资源回收
//		System.gc();// ①
		// 强制垃圾回收机制调用可恢复对象的finalize方法
//        Runtime.getRuntime().runFinalization();//②
		System.runFinalization();// ③
		ft.info();
	}

}
