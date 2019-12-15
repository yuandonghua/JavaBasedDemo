package fit.hrkj.annotation;

/**
 * 演示基类被@Inheritable修饰，子类也被@Inheritable修饰<br>
 * 2019年12月14日下午2:59:35
 * 
 * @author 华软科技
 * @version 1.0
 */
public class SubClass extends Base {
	/**
	 * 程序入口
	 * 
	 * @param args 入口参数
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 打印SubClass类是否有@Inheritable修饰
		System.out.println("SubClass类是否有@Inheritable修饰:"+SubClass.class.isAnnotationPresent(Inheritable.class));
	}
}

/**
 * 演示基类被@Inheritable修饰，子类也被@Inheritable修饰<br>
 * 2019年12月14日下午2:58:39
 * 
 * @author 华软科技
 * @version 1.0
 */
@Inheritable
class Base {

}
