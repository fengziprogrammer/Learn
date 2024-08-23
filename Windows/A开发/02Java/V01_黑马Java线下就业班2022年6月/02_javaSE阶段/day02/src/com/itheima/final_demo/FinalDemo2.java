package com.itheima.final_demo;
/*
    final修饰的变量
        变量可以是基本数据类型: 变量值只能赋值一次 , 不允许修改
        变量可以是引用数据类型: final修饰的引用类型内容可以修改 , 地址不允许修改
 */
public abstract class FinalDemo2 {
    public static void main(String[] args) {
        // 变量可以是基本数据类型: 变量值只能赋值一次 , 不允许修改
        final int NUM = 10;
        // NUM = 100;

        // 变量可以是引用数据类型: final修饰的引用类型内容可以修改 , 地址不允许修改
        final int[] ARR = new int[3];
        // ARR = new int[5];
        ARR[2] = 10;
    }
}
