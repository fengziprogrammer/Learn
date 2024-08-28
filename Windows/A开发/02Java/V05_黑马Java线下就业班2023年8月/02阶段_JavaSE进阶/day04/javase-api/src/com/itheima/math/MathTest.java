package com.itheima.math;

public class MathTest {
    //演示：Math的应用
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //求最大值
        int max = Math.max(a, b);

        //求最小值
        int min = Math.min(a, b);

        //计算次幂
        double num = Math.pow(2, 3);

        //随机数
        double random = Math.random()*100;//Random r = new Random();    int n = r.next(100)

        //四舍五入
        long round = Math.round(4.7);


        System.out.println(max);
        System.out.println(min);
        System.out.println(num);
        System.out.println(random);
        System.out.println(round);

    }
}
