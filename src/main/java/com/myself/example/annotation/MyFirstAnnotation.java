package com.myself.example.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(value = RetentionPolicy.RUNTIME)
public @interface MyFirstAnnotation {

	String value() default "";
	
	String province();
	
}
