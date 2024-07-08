package com.itheima;

/*
    案例: 方法练习1(求和)
        设计一个方法用于求[1-n]之间的数据和(n>1),打印求和结果
 */
public class Demo06 {
    public static void main(String[] args) {
        //6.调用方法
        printSum(-10);
    }
    //1.定义方法
    public static void printSum(int n){
        //7.对n进行判断
        if(n < 1){
            System.out.println("你输入的数据必须大于1");
            //8.结束方法
            return;
        }
        //2.定义求和变量
        int sum = 0;
        //3.使用for循环获取范围内数据
        for (int i = 1; i <= n ; i++) {
            //4.累加
            sum += i;
        }
        //5.打印结果
        System.out.println("sum:" + sum);
    }
}
