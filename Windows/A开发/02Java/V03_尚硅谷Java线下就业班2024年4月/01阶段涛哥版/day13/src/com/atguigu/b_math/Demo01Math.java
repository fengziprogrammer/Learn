package com.atguigu.b_math;

public class Demo01Math {
    public static void main(String[] args) {
        //static int abs(int a) -> 求参数的绝对值
        System.out.println("Math.abs(1) = " + Math.abs(1));
        System.out.println("Math.abs(-1) = " + Math.abs(-1));
        //static double ceil(double a) -> 向上取整
        System.out.println("Math.ceil(2.6) = " + Math.ceil(2.6));
        System.out.println("Math.ceil(-2.6) = " + Math.ceil(-2.6));
        //static double floor(double a) ->向下取整
        System.out.println("Math.floor(2.4) = " + Math.floor(2.4));
        //static long round(double a)  -> 四舍五入
        System.out.println("Math.round(2.6) = " + Math.round(2.6));
        System.out.println("Math.round(-1.8) = " + Math.round(-1.8));
        //static int max(int a, int b) ->求两个数之间的较大值
        System.out.println("Math.max(10,20) = " + Math.max(10, 20));
        //static int min(int a, int b) ->求两个数之间的较小值
        System.out.println("Math.min(10,20) = " + Math.min(10, 20));
    }
}
