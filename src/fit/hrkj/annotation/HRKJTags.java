package fit.hrkj.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 容器注解<br>
 * 2019年12月18日下午3:19:26
 * 
 * @author 华软科技
 * @version 1.0
 */
@Retention(RetentionPolicy.RUNTIME) // 指定该注解信息会保留到运行时环境
@Target(ElementType.TYPE)
public @interface HRKJTags {

	// 定义value成员变量，该成员变量可接受多个@HRKJTag注解
	HRKJTag[] value();

}
