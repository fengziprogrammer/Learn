package com.atguigu.a_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value={ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Book {
    //书名
    String bookName();
    //作者
    String[] author();
    //价格
    int price();
    //库存
    int count() default 10;
}
