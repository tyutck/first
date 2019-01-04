package ck.tyut.first.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)//元注解，标明注解生命周期（编译时、运行时）
@Target({ElementType.METHOD,ElementType.TYPE})//元注解,标明注解使用范围（类、方法、属性等）
public @interface FirstAnnotation {
	String color() default "red";
	String value() default "ck";
	int[] arr() default {1,2,3};
	ElementType enums() default ElementType.METHOD;
	Target annotation() default @Target({ElementType.METHOD});
}
