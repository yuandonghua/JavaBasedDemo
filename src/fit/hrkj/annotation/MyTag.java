package fit.hrkj.annotation;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * 使用default给注解的成员变量赋默认值<br>
 * 2019年12月16日下午4:44:55
 * 
 * @author 华软科技
 * @version 1.0
 */
@Retention(RUNTIME)
@Target(METHOD)
public @interface MyTag {
	// 定义带两个成员变量的注解
	// 注解中的成员变量以方法的形式来定义
	String name() default "hrkj";

	int age() default 1;
}
