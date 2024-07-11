package com.atguigu.c_method;

public class Demo02Method {
    public static void main(String[] args) {
        //直接调用
        sum(10,20);
    }

    //有参无返回值的方法
    public static void sum(int a,int b){
        int sum = a+b;
        System.out.println("sum = " + sum);
    }
}
