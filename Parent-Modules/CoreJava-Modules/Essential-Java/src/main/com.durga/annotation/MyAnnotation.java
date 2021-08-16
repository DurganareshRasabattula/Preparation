/**
 * 
 */
package annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Retention(RUNTIME)
/**
 * 
 * 
 * @since 1.0.0 2017年3月14日
 * @author durga on 8/16/2021
 */
public @interface MyAnnotation {
	String company() default "waylau.com";
}
