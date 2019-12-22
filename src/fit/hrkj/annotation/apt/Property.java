package fit.hrkj.annotation.apt;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.SOURCE;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * 修饰普通成员变量<br>
 * 2019年12月21日下午8:06:07
 * 
 * @author 华软科技
 * @version 1.0
 */
@Documented
@Retention(SOURCE)
@Target(FIELD)
public @interface Property {
	String column();

	String type();
}
