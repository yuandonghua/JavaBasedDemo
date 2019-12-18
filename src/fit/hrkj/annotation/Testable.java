package fit.hrkj.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 演示@Retention,定义@Testable注解保留到运行时<br>
 * 2019年12月14日下午2:13:32
 * 
 * @author 华软科技
 * @version 1.0
 */
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Testable {

}
