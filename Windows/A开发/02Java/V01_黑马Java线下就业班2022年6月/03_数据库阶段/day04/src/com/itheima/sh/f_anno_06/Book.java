package com.itheima.sh.f_anno_06;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/*
    1.@Target元注解表示修饰注解使用的位置：
        1）ElementType.METHOD：表示自定义注解可以修饰方法
        2）ElementType.TYPE：表示自定义注解可以修饰类和接口
    2.@Retention元注解表示修饰注解的存活时间(生命周期)
        RetentionPolicy.RUNTIME 表示自定义注解存活在.java .class 以及内存中

 */
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Book {
    //属性
    String value();//书名
    double price() default 100;//价格
    String[] authors();//作者
   
}
