package com.itheima.api_demo.integer_demo;
/*
    1. 包装类对象的初始值为null（是一个对象）。
    2. Java中除了float和double的其他基本数据类型，都有常量池。
        整数类型：[-128,127]值在常量池
        字符类型：[0,127]对应的字符在常量池
        布尔类型：true，false在常量池
    3. 在常量池中的数据 , 会进行共享使用,减少频繁创建,从而提高性能,不在常量池会创建新的对象
 */
public class Test2 {
    public static void main(String[] args) {
        // [-128,127]值在常量池
//        Integer i1 = 127;
//        Integer i2 = 127;

        // 自动装箱原理
        // Integer i1 = Integer.valueOf(128);
        Integer i1 = 128;
        Integer i2 = 128;

        System.out.println(i1 == i2);


        // 自动拆箱的原理
        // int num = i1.intValue();
        int num = i1;
    }
}


//public class Test2 {
//
//    public Test2() {
//    }
//
//    public static void main(String args[])
//    {
//        Integer i1 = Integer.valueOf(128);
//        Integer i2 = Integer.valueOf(128);
//        System.out.println(i1 == i2);
//    }
//}
