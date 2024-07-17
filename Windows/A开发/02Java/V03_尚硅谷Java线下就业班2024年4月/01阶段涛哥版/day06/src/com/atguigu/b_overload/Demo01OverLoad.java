package com.atguigu.b_overload;

public class Demo01OverLoad {
    public static void main(String[] args) {
        sum(1,2);
        sum(1,2,3);
        sum(1,2,3,4);
    }
    //两个整数相加
    public static void sum(int a,int b){
        int sum = a+b;
        System.out.println("sum = " + sum);
    }

    //三个整数相加
    public static void sum(int a,int b,int c){
        int sum = a+b+c;
        System.out.println("sum = " + sum);
    }

    //四个整数相加
    public static void sum(int a,int b,int c,int d){
        int sum = a+b+c+d;
        System.out.println("sum = " + sum);
    }

   /* public static int sum(int a,int b){
        return a+b;
    }*/
   /* public static void sum(int x,int y){
        System.out.println(x+y);
    }*/
}
