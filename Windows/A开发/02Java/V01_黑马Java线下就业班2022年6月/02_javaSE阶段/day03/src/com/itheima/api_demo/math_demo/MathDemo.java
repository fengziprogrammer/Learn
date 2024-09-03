package com.itheima.api_demo.math_demo;

/*
    Math类 : 数学工具类
    构造方法 : private Math() {}

    工具类设计思想 :
        1 私有构造(防止外界创建对象)
        2 所有成员静态修饰

    成员方法 :
        public static int abs(int a)	获取参数a的绝对值：
        public static double ceil(double a)	向上取整
        public static double floor(double a)	向下取整
        public static double pow(double a, double b)	获取a的b次幂
        public static long round(double a)	四舍五入取整
 */
public class MathDemo {
    public static void main(String[] args) {
        // public static int abs(int a)	获取参数a的绝对值：
        System.out.println(Math.abs(-100));

        // public static double ceil(double a)	向上取整
        System.out.println(Math.ceil(12.000001));
        // public static double floor(double a)	向下取整
        System.out.println(Math.floor(12.9999));

        // public static double pow(double a, double b)	获取a的b次幂
        System.out.println(Math.pow(4, 3));

        // public static long round(double a)	四舍五入取整
        System.out.println(Math.round(12.5111));

        // public static double random() : 产生随机数 [0 , 1)
        // [1,10]
        System.out.println((int) (Math.random() * 10) + 1); // [1 , 10]
    }
}
