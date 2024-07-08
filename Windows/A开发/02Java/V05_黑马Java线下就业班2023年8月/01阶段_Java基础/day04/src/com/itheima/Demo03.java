package com.itheima;

/*
    案例: 方法练习(输出较大值) -> 带参数
        定义方法,接收两个整数,判断较大值并打印
        调用方法查看结果
 */
public class Demo03 {
    public static void main(String[] args) {
        //调用方法
        getMax(10,20);
    }

    //定义方法
    public static void getMax(int a,int b) {
//        //定义两个变量
//        int a = 10;
//        int b = 20;
        //打印较大值
        if (a > b) {
            System.out.println(a);
        } else if (a < b) {
            System.out.println(b);
        } else {
            System.out.println("相等");
        }
    }
}
