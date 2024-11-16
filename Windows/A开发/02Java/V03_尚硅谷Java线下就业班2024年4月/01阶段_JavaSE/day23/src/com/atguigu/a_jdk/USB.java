package com.atguigu.a_jdk;

public interface USB {
    //私有的非静态方法
    private void method01(){
        System.out.println("我是私有的非静态方法");
    }

    //私有的静态方法
    private static void method02(){
        System.out.println("我是私有的静态方法");
    }

    //定义一个静态方法-> 共有的
    public static void method03(){
        method02();
    }

    //定义一个默认方法
    public default void method04(){
        method01();
    }
}
