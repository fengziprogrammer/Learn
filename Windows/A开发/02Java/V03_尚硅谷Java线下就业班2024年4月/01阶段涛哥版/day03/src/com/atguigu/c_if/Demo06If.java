package com.atguigu.c_if;

import java.util.Scanner;

public class Demo06If {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请你输入一个年份:");
        int year = sc.nextInt();
        /*
           a.能被4整除,但是不能被100整除
           b.或者能直接被400整除
         */
        if ((year%4==0 && year%100!=0) || (year%400==0)){
            System.out.println("闰年2月有29天");
        }else{
            System.out.println("平年2月有28天");
        }
    }
}
