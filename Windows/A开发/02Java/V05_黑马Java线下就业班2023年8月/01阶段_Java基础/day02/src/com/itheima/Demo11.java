package com.itheima;

/*
    需求:
        使用三元运算符完成, 求三个整数的最大值
    三元运算符学习目的:
        识别
 */
public class Demo11 {
    public static void main(String[] args) {
        //定义变量
        int a = 10, b = 20, c = 30;

        //先比较a和b, 获取较大值temp
        int temp = a > b ? a : b;

        //再比较temp和c, 获取最大值max
        int max = temp > c ? temp : c;

        //扩展: 一行求出max
        //int max = (a > b ? a : b) > c ? (a > b ? a : b) : c;

        //打印结果
        System.out.println("max:" + max);
    }
}
