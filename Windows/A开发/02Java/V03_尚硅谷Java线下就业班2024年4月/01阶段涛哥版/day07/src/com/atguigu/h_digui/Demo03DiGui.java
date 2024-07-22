package com.atguigu.h_digui;

public class Demo03DiGui {
    public static void main(String[] args) {
        int result = method(3);
        System.out.println("result = " + result);
    }

    public static int method(int n) {
        if (n==1){
            return 1;
        }
        return n*method(n-1);
    }
}
