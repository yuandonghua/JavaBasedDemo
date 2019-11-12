package fit.hrkj.generic;

/**
 * <br>
 * 2019年8月12日 下午3:22:52
 * 
 * @author 华软科技
 * @version 1.0
 */
public class GenericDiamondTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// B类声明中的E形参是String类型
		// 泛型构造器中声明的T形参是Integer类型
		B<String> b1 = new B<String>(5);
		// 显式指定泛型构造器中声明的T形参是Integer类型
		B<String> b2 = new <Integer>B<String>(5);
		// B类声明中的E形参是String类型
		// 如果显式指定泛型构造器中声明的T形参是Integer类型
		// 此时就不能使用“菱形”语法，下面代码是错误的
//		B<String> b3 = new <Integer>B<>(5);
	}

}

class B<E> {

	public <T> B(T t) {
		System.out.println("t的值：" + t);

	}
}
