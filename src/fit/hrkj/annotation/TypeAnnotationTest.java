package fit.hrkj.annotation;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

/**
 * 演示类型注解<br>
 * 2019年12月18日下午7:37:57
 * 
 * @author 华软科技
 * @version 1.0
 */
@NotNull // 定义类时使用类型注解
public class TypeAnnotationTest implements @NotNull Serializable {
	/**
	 * 程序入口
	 * 
	 * @param args 入口参数,方法形参中使用类型注解
	 */
	public static void main(@NotNull String[] args) {
		// TODO Auto-generated method stub
		Object object = "hrkj.fit";
		// 强制类型转换时使用类型注解
		String str = (@NotNull String) object;

		// 创建对象时使用类型注解
		String str2 = new @NotNull String("好好学java");
		// 泛型中使用类型注解
		List<@NotNull String> list = new ArrayList<String>();

	}

}

/**
 * 定义一个简单的类型注解，不带任何成员变量<br>
 * 2019年12月18日下午7:39:51
 * 
 * @author 华软科技
 * @version 1.0
 */
@Target(ElementType.TYPE_USE)
@interface NotNull {

}
