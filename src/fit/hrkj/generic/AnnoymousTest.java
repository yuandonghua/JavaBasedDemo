package fit.hrkj.generic;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * <br>
 * 2019年8月1日 下午8:13:18
 * 
 * @author 华软科技
 * @version 1.0
 */
public class AnnoymousTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 指定Foo类中泛型为String
		Foo<String> f1 = new Foo<>() {
			// test（）方法的参数类型为String
			public void test(String t) {
				System.out.println("test方法的参数t为：" + t);
			};
		};
		// 使用泛型通配符，此时相当于通配符的上限为Object
		Foo<?> f2 = new Foo<>() {
			// test()方法的参数类型为Object
			public void test(Object t) {
				System.out.println("test方法的Object参数为：" + t);
			};
		};
		Foo<? extends Number> f3 = new Foo<>() {
			// 此时test（）方法的参数类型为Number
			public void test(Number t) {
				System.out.println("test方法的Number参数为：" + t);
			};
		};

	}

}

interface Foo<T> {
	void test(T t);
}
