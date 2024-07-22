package com.atguigu.g_var;

public class Demo01Var {
    public static void main(String[] args) {
        sum(1,2,3,4,56,545,5,7,8,7,6);
    }
    public static void sum(int j,int...arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("sum = " + sum);
    }
}
