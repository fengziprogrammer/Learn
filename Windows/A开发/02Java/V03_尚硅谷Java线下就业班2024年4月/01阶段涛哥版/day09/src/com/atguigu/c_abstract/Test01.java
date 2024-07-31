package com.atguigu.c_abstract;

public class Test01 {
    public static void main(String[] args) {
        JavaEE javaEE = new JavaEE();
        javaEE.setId(1);
        javaEE.setName("涛哥");
        javaEE.work();
        System.out.println("======================");

        JavaEE javaEE1 = new JavaEE(2, "曼曼");
        javaEE1.work();

    }
}
