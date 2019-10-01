package com.spring.example;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation
{
	
}


@MyAnnotation
public class Test {

	public static void main(String[] args) {
		System.out.println("hello annotation");

	}

}
