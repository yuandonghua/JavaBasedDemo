package fit.hrkj.generic;

/**
 * <br>
 * 2019年8月12日 上午11:15:04
 * 
 * @author 华软科技
 * @version 1.0
 */
public class GenericConstructor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 泛型构造器中的T类型为String
		new A("java");
		// 泛型构造器中的T类型为Integer
		new A(100);
		// 显式指定泛型构造器中的T类型为String
		// 传给A构造器的实参也是String对象，完全正确
		new <String>A("java");// ①
		// 显式指定泛型构造器中的T类型为String
		// 但传给A构造器的实参是Double对象，下面代码出错
//		new <String>A(6.6);// ②
	}

}

class A {
	public <T> A(T t) {
		System.out.println(t);
	}
}
