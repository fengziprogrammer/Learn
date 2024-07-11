package com.atguigu.c_method;

public class Demo04Method {
    public static void main(String[] args) {
        int sum = sum(10, 20);
        System.out.println("sum = " + sum);
    }
    public static int sum(int a,int b){
        int sum = a+b;
        return sum;

        //return a+b;
    }
}
