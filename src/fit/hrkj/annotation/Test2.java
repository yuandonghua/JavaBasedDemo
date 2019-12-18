package fit.hrkj.annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;

/**
 * 演示获取方法上的所有注解<br>
 * 2019年12月17日下午7:31:46
 * 
 * @author 华软科技
 * @version 1.0
 */
public class Test2 {
	@MyTag
	public void info() {

	}

	/**
	 * 程序入口
	 * 
	 * @param args 入口参数
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Annotation[] annotations = Class.forName(Test2.class.getName()).getMethod("info").getAnnotations();
			// 遍历所有注解
			for (Annotation annotation : annotations) {
				System.out.println(annotation);
				if (annotation instanceof MyTag) {
					MyTag tag = (MyTag) annotation;
					System.out.println("name:" + tag.name());
					System.out.println("age:" + tag.age());
				}
			}
		} catch (NoSuchMethodException | SecurityException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
