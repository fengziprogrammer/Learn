package com.itheima.sh.g_anno_07;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//修饰方法
@Target(ElementType.METHOD)
//存活时间是在内存中
@Retention(RetentionPolicy.RUNTIME)
public @interface MyTest {
}
