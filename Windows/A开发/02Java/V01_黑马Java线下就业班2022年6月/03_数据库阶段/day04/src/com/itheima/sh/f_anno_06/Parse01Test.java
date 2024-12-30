package com.itheima.sh.f_anno_06;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Parse01Test {
    public static void main(String[] args) throws Exception {
        /*
            解析注解Book，获取属性值
         */
        method_02();
    }

    private static void method_02()throws Exception {
         /*
            解析方法上的注解
         */
        //1.获取BookStore类
        Class<?> clazz = Class.forName("com.itheima.sh.f_anno_06.BookStore");
        //2.获取方法sellBook()
        Method m = clazz.getMethod("sellBook");
        //3.判断sellBook方法上是否含有注解@Book
        if(m.isAnnotationPresent(Book.class)){
            //说明sellBook()方法上含有注解@Book
            //4.获取注解
            Book book = m.getDeclaredAnnotation(Book.class);
            //5使用注解对象调用属性名获取属性值
            String[] authors = book.authors();
            double price = book.price();
            String value = book.value();
            //5.输出
            System.out.println(Arrays.toString(authors)+"--"+price+"---"+value);
        }

    }

    private static void method_01() throws Exception{
        /*
            解析类上的注解：
            获取BookStore类的
            @Book(value = "删库跑路",price = 200,authors = {"锁哥","老毕","班导","老杨"})
            注解中的所有数据并输出到控制台
         */
        //1.获取BookStore类的Class对象
        Class<?> clazz = Class.forName("com.itheima.sh.f_anno_06.BookStore");
        //2.判断BookStore类上是否存在注解 @Book
        /*
            boolean isAnnotationPresent(Class<? extends Annotation> annotationClass)
                如果指定类型的注解存在于此元素上，则返回 true，否则返回 false。
                参数：
                    annotationClass：表示注解的Calss类型例如：Book.class
         */
        if(clazz.isAnnotationPresent(Book.class)){
            //说明在类BookStore上存在注解 @Book
            //3.获取注解@Book
            /*
                 public  A getDeclaredAnnotation(Class<A> annotationClass)
                    参数：
                        annotationClass：表示要解析的注解的Class类型
             */
            Book book = clazz.getDeclaredAnnotation(Book.class);
            //4.获取数据
            String[] authors = book.authors();
            double price = book.price();
            String value = book.value();
            //5.输出
            System.out.println(Arrays.toString(authors)+"--"+price+"---"+value);
        }

    }
}
