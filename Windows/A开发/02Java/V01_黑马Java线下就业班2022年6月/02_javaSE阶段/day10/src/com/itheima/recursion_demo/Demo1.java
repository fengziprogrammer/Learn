package com.itheima.recursion_demo;

/*
        需求：用递归求5的阶乘，并把结果在控制台输出

        思路：
            1 定义一个方法，用于递归求阶乘，参数为一个int类型的变量
            2 在方法内部判断该变量的值是否是1
                是：返回1
                不是：返回n*(n-1)!
            3 调用方法
            4 输出结果
 */
public class Demo1 {
    public static void main(String[] args) {
        int result = jc(5);
        System.out.println(result);
    }

    // 此方法接收一个整数 , 返回此整数的阶乘数据
    private static int jc(int n) {
        // 在方法内部判断该变量的值是否是1
        if (n == 1) {
            return 1;
        } else {
            return n * jc(n - 1);
        }
    }
}