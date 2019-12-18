package fit.hrkj.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 定义一个修饰类的注解<br>
 * 2019年12月18日下午2:46:23
 * 
 * @author 华软科技
 * @version 1.0
 */
@Retention(RetentionPolicy.RUNTIME) // 指定该注解信息会保留到运行时环境
@Target(ElementType.TYPE)
@Repeatable(HRKJTags.class)
public @interface HRKJTag {
	// 为该注解定义两个成员变量
	String name() default "华软科技";

	int age() default 1;
}
