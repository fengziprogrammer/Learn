package com.atguigu.a_method;

public class Demo02Method {
    public static void main(String[] args) {
        int sum = sum();
        System.out.println("sum = " + sum);
    }
    public static int sum(){
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum+=i;
        }
        return sum;
    }
}
