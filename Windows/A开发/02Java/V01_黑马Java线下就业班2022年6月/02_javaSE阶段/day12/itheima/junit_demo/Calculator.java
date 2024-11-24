package com.itheima.junit_demo;
/*
    被测试的业务类 : 计算器
 */
public class Calculator {
    // 静态变量，用于存储运行结果 , 默认值为0
    private static int result;

    // 加法运算
    public void add(int n) {
        result = result + n;
    }

    // 减法运算
    public void subtract(int n) {
        // result = result - 1;
        result = result - n;
    }

    // 乘法运算
    public void multiply(int n) {
        // 此方法尚未写好
    }

    // 除法运算
    public void divide(int n) {
        if(n == 0){
            return;
        }
        result = result / n;
    }

    // 平方运算
    public void square(int n) {
        result = n * n;
    }

    // 平方根运算
    public void squareRoot(int n) {
        // public static double sqrt(double a)
        result  = (int) Math.sqrt(n);
        // for (; ; ){}
    }

    // 将结果清零
    public void clear() {
        result = 0;
    }

    // 返回运算结果
    public int getResult() {
        return result;
    }
}
