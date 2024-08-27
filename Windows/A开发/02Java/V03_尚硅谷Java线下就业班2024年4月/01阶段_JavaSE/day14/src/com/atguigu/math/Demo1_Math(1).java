package com.atguigu.math;

public class Demo1_Math {

    /*
     public static double abs(double a) ` ：返回 double 值的绝对值。
     public static double ceil(double a)` ：返回大于等于参数的最小的整数。(天花板,向上取整)
     public static double floor(double a) ` ：返回小于等于参数最大的整数。(地板,向下取整)
     public static long round(double a)` ：返回最接近参数的 long。(类似于四舍五入方法)
     public static double pow(double a,double b)：返回a的b幂次方
     public static double sqrt(double a)：返回a的平方根(开平方)
     public static double random()：返回[0,1)的随机值
     public static final double PI：返回圆周率
     public static double max(double x, double y)：返回x,y中的最大值
     public static double min(double x, double y)：返回x,y中的最小值
     */
    public static void main(String[] args) {

       /* System.out.println(Math.abs(3.3));
        System.out.println(Math.abs(-3.3));
        System.out.println("-------------------");

        System.out.println(Math.ceil(12.7));
        System.out.println(Math.ceil(12.001));
        System.out.println(Math.ceil(13.6));
        System.out.println(Math.ceil(-13.6));
        System.out.println(Math.ceil(-13.1));
        System.out.println("-------------------");

        System.out.println(Math.floor(13.6));
        System.out.println(Math.floor(13.1));
        System.out.println(Math.floor(-13.6));
        System.out.println(Math.floor(-13.1));
        System.out.println("-------------------");

        System.out.println(Math.round(13.1));
        System.out.println(Math.round(13.5));
        System.out.println(Math.round(13.6));
        System.out.println(Math.round(-13.1));
        System.out.println(Math.round(-13.5));//注意 与现实中不同   floor(a + 1/2)
        System.out.println(Math.round(-13.6));
        System.out.println("________");*/
        System.out.println(Math.pow(3,2));
        System.out.println(Math.sqrt(5));
        System.out.println(Math.sqrt(9));
        for (int i = 0; i < 10; i++) {
            System.out.println(Math.random() * 100 + 1);//[0,1)
        }
        System.out.println("-------------");
        System.out.println(Math.PI);
        System.out.println(Math.max(3.3,6.6));
        System.out.println(Math.min(3.3,6.6));

    }
}
