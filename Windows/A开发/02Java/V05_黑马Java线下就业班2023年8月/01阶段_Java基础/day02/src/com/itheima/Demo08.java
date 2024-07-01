package com.itheima;

/*
    需求: 使用程序,判断一个整数的奇偶数,打印结果

    if(条件){
        满足才会走这里;
    }

    if(条件){
        满足才会走这里;
    }else{
        不满足才会走这里;
    }

 */
public class Demo08 {
    public static void main(String[] args) {
        System.out.println("程序开始");
        //定义变量
        int num = 11;
        num = 12;
        //判断条件, 如果能被2整除, 代表是偶数, 反之则是奇数
        if(num % 2 == 0){
            System.out.println("偶数");
        } else {
            System.out.println("奇数");
        }
        System.out.println("程序结束");
    }
}
