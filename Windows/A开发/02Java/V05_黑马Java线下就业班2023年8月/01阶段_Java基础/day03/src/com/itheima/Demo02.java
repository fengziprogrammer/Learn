package com.itheima;

/*
    案例: for循环案例2(求和思想)
        求整数[1-100]的和
 */
public class Demo02 {
    public static void main(String[] args) {
        //定义求和变量
        int sum = 0;
        //获取1到100之间的所有整数
        for (int i = 1; i <= 100 ; i++) {
            //累加
            sum += i;
        }
        //循环结束,打印结果
        System.out.println(sum);
    }
}
