package fit.hrkj.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 注解处理工具<br>
 * 2019年12月17日下午8:30:03
 * 
 * @author 华软科技
 * @version 1.0
 */
public class ProcessorTest {
	public static void process(String clazz) {
		int passed = 0;
		int failed = 0;
		// 遍历clazz对应的类里的所有方法
		try {
			for (Method m : Class.forName(clazz).getMethods()) {
				// 如果该方法使用@Testable修饰了
				if (m.isAnnotationPresent(Testable.class)) {
					try {
						// 调用m的方法
						m.invoke(null);
						// 测试成功，passed计数器加1
						passed++;
					} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
						// TODO Auto-generated catch block
						System.out.println("方法" + m + "运行失败，异常：" + e.getCause());
						// 测试出现异常，failed计数器加1
						failed++;
					}
				}
			}
		} catch (SecurityException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(clazz+"类不存在");
		}
		System.out.println("总共运行了：" + (passed + failed) + "个方法，其中：\n失败了：" + failed + "个，\n成功了：" + passed + "个！");
	}
}
