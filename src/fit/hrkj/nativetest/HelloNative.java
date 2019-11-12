package fit.hrkj.nativetest;

/**
 * <br>
 * 2019年5月24日 上午9:58:44
 * 
 * @author 华软科技
 * @version 1.0
 */
public class HelloNative {
	// 加载动态链接库
	static {
		System.loadLibrary("HelloNative");
	}

	// 定义native方法
	public static native void sayHello();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sayHello();
	}

}
