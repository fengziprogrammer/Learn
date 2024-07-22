package com.atguigu.h_digui;

public class Demo02DiGui {
    public static void main(String[] args) {
        method(3);
    }
    public static void method(int n){
        if (n==1){
            System.out.println(n);
            return;//结束方法
        }
        System.out.println(n);
        n--;
        method(n);
    }
}
