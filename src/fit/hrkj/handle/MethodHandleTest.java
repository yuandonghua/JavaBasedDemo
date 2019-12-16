package fit.hrkj.handle;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/**
 * <br>
 * 2019年5月30日 上午9:56:13
 * 
 * @author 华软科技
 * @version 1.0
 */
public class MethodHandleTest {
	// 定义一个private类方法
	@SuppressWarnings("unused")
	private static void hello() {
		System.out.println("Hello world!");
	}

	// 定义一个private实例方法
	@SuppressWarnings("unused")
	private String hello(String name) {
		System.out.println("执行带参数的hello:" + name);
		return name + "你好";
	}

	/**
	 * @param args
	 * @throws Throwable
	 */
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		// 定义一个返回值为void,不带形参的方法类型,void.class首字母小写
		MethodType methodType = MethodType.methodType(void.class);
		// 使用MethodHandles.Lookup的findStatic获取类方法
		MethodHandle methodHandle = MethodHandles.lookup().findStatic(MethodHandleTest.class, "hello", methodType);
		// 通过MethodHandle执行方法
		methodHandle.invoke();
		// 使用MethodHandles.Lookup的findVirtual获取实例方法
		MethodHandle methodHandle2=MethodHandles.lookup().findVirtual(MethodHandleTest.class, "hello",
				//指定获取返回值类型为String,形参为String的方法类型
				MethodType.methodType(String.class, String.class));
		//通过MethodHandle执行方法,传入主调对象和参数
		System.out.println(methodHandle2.invoke(new MethodHandleTest(),"孙悟空"));
		
		
		
		
	}

}
