package fit.hrkj.annotation;

import java.lang.annotation.Annotation;

/**
 * 演示Test1类的方法被@Testable5注解修饰<br>
 * 2019年12月14日下午2:37:57
 * 
 * @author 华软科技
 * @version 1.0
 */
public class Test1 {
	@Testable5
	public void info() {
		System.out.println("info方法...");
	}

	/**
	 * 程序入口
	 * 
	 * @param args 入口参数
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Annotation[] annotations = Class.forName(Test1.class.getName()).getMethod("info").getAnnotations();
			// 遍历所有注解
			for (Annotation annotation : annotations) {
				System.out.println(annotation);
			}
		} catch (NoSuchMethodException | SecurityException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
