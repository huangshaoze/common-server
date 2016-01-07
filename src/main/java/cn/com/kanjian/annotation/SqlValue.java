package cn.com.kanjian.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({METHOD, FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface SqlValue {

	String value();
	
}
