package com.atguigu.e_calendar;

import java.util.Calendar;
import java.util.Scanner;

public class Demo02Calendar {
    public static void main(String[] args) {
        //1.创建Scanner对象,调用nextInt方法,录入一个年份 year
        Scanner sc = new Scanner(System.in);
        System.out.println("请您输入一个年份:");
        int year = sc.nextInt();
        //2.获取Calendar对象
        Calendar calendar = Calendar.getInstance();
        //3.调用set方法,设置年月日
        //set(year,2,1) -> 设置2月1日相当于3月1日,因为外国是从0开始
        calendar.set(year,2,1);
        //4.将1日往前-1天就变成了2月的最后一天
        calendar.add(Calendar.DATE,-1);
        //5.获取day的字段,比较是否为28,如果是28平年
        int day = calendar.get(Calendar.DATE);
        if (day==28){
            System.out.println("今年是平年");
        }else{
            System.out.println("今年是闰年");
        }
    }
}
