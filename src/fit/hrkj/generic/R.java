package fit.hrkj.generic;

/**
 * <br>
 * 2019年8月4日 下午9:20:17
 * 
 * @author 华软科技
 * @version 1.0
 */
public class R<T> {
	// 下面代码错误，不能在静态变量声明中使用泛型形参
//	static T info;
	T ageT;

	public void foo(T msg) {
	}

	// 下面代码错误，不能在静态方法声明中使用泛型形参
//	public static void test(T msg) {
//	}
}
