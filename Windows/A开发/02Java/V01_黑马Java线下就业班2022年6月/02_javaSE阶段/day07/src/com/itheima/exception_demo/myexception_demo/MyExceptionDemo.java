package com.itheima.exception_demo.myexception_demo;

/*
    需求 : 设计一个方法 , 接收一个年龄(0-150) , 不满足要求的范围 , 则抛出一个自定义异常
 */
public class MyExceptionDemo {
    public static void main(String[] args) {
        checkAge(200);
    }

    public static void checkAge(int age) {
        if (age < 0 || age > 150) {
            throw new AgeOutBoundsException("年龄不合法...");
        }
        System.out.println("年龄为" + age);
    }
}