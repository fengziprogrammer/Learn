package com.itheima.static_demo;

public class Student {
    public String name;
    public int age;
    public static String school; // 学校

    public void show() {
        System.out.println("名字:" + name);
        System.out.println("年龄:" + age);
        System.out.println("学校:" + school);
    }

    // 非静态方法可以访问任何成员
    public void method1() {
        System.out.println(name);
        System.out.println(school);
        method2();
        method3();
    }

    public void method2() {
        System.out.println(this);
    }

    // 静态方法中只能访问静态成员
    public static void method3() {
        // System.out.println(name);// 非静态变量
        System.out.println(school);
        // method2();// 非静态方法
        method4();
    }

    // 现有的类 , 再有的对象
    // 静态成员随着类的加载而加载
    // 所以静态成员优先于对象进内存
    // 先进内存的不能调用后进内存的
    public static void method4() {
        // System.out.println(this);
    }

    public void study(){

    }
}
