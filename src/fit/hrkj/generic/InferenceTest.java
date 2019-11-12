package fit.hrkj.generic;

/**
 * <br>
 * 2019年8月12日 下午4:08:56
 * 
 * @author 华软科技
 * @version 1.0
 */
public class InferenceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 可以通过方法赋值的目标参数来推断泛型为String
		C<String> c1 = C.test1();
		// 无须使用下面语句在调用test1()方法时指定泛型的类型
		C<String> c2 = C.<String>test1();
		// 可调用test2()方法所需的参数类型来推断泛型为Integer
		C<Integer> c3 = C.test2(66, C.test1());
		// 无须使用下面语句在调用test1()方法时指定泛型的类型
		C<Integer> c4 = C.test2(66, C.<Integer>test1());
		// 希望系统能推断出调用test1()方法时泛型为String类型
		String s = C.<String>test1().test3();
	}

}

class C<E> {

	public static <Z> C<Z> test1() {

		return null;
	}

	public static <Z> C<Z> test2(Z z, C<Z> c) {

		return null;
	}

	E test3() {
		return null;
	}
}
