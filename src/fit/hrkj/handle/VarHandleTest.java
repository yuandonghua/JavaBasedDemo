package fit.hrkj.handle;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;
import java.util.Arrays;

/**
 * <br>
 * 2019年5月30日 上午10:19:01
 * 
 * @author 华软科技
 * @version 1.0
 */
public class VarHandleTest {

	/**
	 * @param args
	 * @throws IllegalAccessException
	 * @throws NoSuchFieldException
	 */
	public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
		// TODO Auto-generated method stub
		String[] strings = { "Java", "Kotlin", "Go" };
		// 获取一个String[]数组的VarHandle对象
		VarHandle varHandle = MethodHandles.arrayElementVarHandle(String[].class);
		// 比较并设置:如果第三个元素是Go,则该元素被设为Lua
		boolean b = varHandle.compareAndSet(strings, 2, "Go", "Lua");
		// 输出比较结果
		System.out.println(b);
		// 看到第三个元素被替换成Lua
		System.out.println(Arrays.toString(strings));
		// 获取strings数组的第二个元素:Kotlin
		System.out.println(varHandle.get(strings, 1));
		// 获取并设置:返回第三个元素,并将第三个元素设为Swift
		System.out.println(varHandle.getAndSet(strings, 2, "Swift"));
		// 看到第三个元素被替换成Swift
		System.out.println(Arrays.toString(strings));

		// 用findVarHandle方法获取User类中名为name,类型为String的实例变量
		VarHandle varHandle2 = MethodHandles.lookup().findVarHandle(User.class, "name", String.class);
		User user = new User();
		// 通过VarHandle获取实例变量的值,需要传入对象作为调用者
		System.out.println(varHandle2.get(user));// 输出null
		// 通过VarHandle设置指定实例变量的值
		varHandle2.set(user, "孙悟空");
		// 输出user的name实例变量的值
		System.out.println(user.name);
		// 用findVarHandle方法获取User类中名为MAX_AGE,类型为int的类变量
		VarHandle varHandle3 = MethodHandles.lookup().findStaticVarHandle(User.class, "MAX_AGE", int.class);
		// 通过VarHandle获取指定类变量的值
		System.out.println(varHandle3.get());// 输出0
		// 通过VarHandle设置指定类变量的值
		varHandle3.set(100);
		// 输出User的MAX_AGE类变量
		System.out.println(User.MAX_AGE);

	}

}

class User {
	String name;
	static int MAX_AGE;

}
