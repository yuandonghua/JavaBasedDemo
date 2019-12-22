package fit.hrkj.annotation.apt;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.SOURCE;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * 标识注解<br>
 * 2019年12月21日下午8:01:07
 * 
 * @author 华软科技
 * @version 1.0
 */
@Documented
@Retention(SOURCE)
@Target(FIELD)
public @interface Id {

	String column();

	String type();

	String generator();

}
