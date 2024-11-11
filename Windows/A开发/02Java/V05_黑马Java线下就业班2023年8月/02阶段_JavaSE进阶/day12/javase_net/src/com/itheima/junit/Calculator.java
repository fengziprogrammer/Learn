package com.itheima.junit;

public class Calculator {
    // 静态变量，用于存储运行结果
    private static int result; // 20

    // 加法运算
    public int add(int n) {
        result = result + n;
        return result;
    }

    //求和运算
    public int add(int num1 , int num2){
        return num1+num2;
    }



    // 减法运算
    public void subtract(int n) {
        // Bug: 正确的应该是 result = result - n
        result = result - 1;
        System.out.println(result);
    }

    // 乘法运算
    public void multiply(int n) {
        // 此方法尚未写好
    }

    // 除法运算
    public void divide(int n) {
        result = result / n;
    }

    // 平方运算
    public void square(int n) {
        result = n * n;
    }

    // 平方根运算
    public void squareRoot(int n) {
        // Bug : 死循环
        for (; ;) ;
    }

    // 将结果清零
    public void clear() {
        result = 0;
    }

    // 返回运算结果
    public int getResult(){
        return result;
    }
}
