package fit.hrkj.annotation;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * 演示@Documented注解，Testable5注解将被javadoc工具提取<br>
 * 2019年12月14日下午2:35:38
 * 
 * @author 华软科技
 * @version 1.0
 */
@Documented
@Retention(RUNTIME)
@Target(METHOD)
public @interface Testable5 {

}
