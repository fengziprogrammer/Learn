package com.atguigu.e_annotation;

public @interface Book {
    //书名
    String bookName();
    //作者
    String[] author();
    //价格
    double price();
    //数量
    int count() default 10;
}
