package com.itheima;

/*
    案例: 方法练习(输出较大值) -> 带参数带返回值
        定义方法,接收两个整数,判断较大值并返回
        调用方法接收返回值,并打印
 */
public class Demo04 {
    public static void main(String[] args) {
        //调用方法
        int max = getMax(10, 20);
        System.out.println("max:" + max);
    }

    //定义方法
    public static int getMax(int a, int b) {
        //返回较大值
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
