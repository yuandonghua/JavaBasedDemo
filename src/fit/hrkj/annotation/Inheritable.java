package fit.hrkj.annotation;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * 演示@Inherited<br>
 * 2019年12月14日下午2:56:19
 * 
 * @author 华软科技
 * @version 1.0
 */
@Retention(RUNTIME)
@Target(TYPE)
@Inherited
public @interface Inheritable {

}
