package com.itheima.date.baseapp;

import java.util.Date;

public class DateTest {
    //演示：Date对象的使用
    public static void main(String[] args) {
        method1();
        //Mon Oct 31 16:07:08 CST 2022
        //1667203628011
        method2();
    }

    public static void method2() {
        //根据给定的毫秒值，创建日期对象
        Date date2 = new Date(1667203628011L);
        //date2.setTime(1667203628011L);
        System.out.println(date2);
    }


    public static void method1() {
        //创建Date对象
        Date date1 = new Date(); //以当前系统时间为准，创建一个日期对象

        System.out.println(date1); //打印日期格式是外国日期格式

        //成员方法：获取毫秒值
        long time = date1.getTime();//以日期对象中存储的时间为准，转换为毫秒值（计算规则：从1970年1月1日0时0分0秒开始向后计算）
        System.out.println(time);
    }
}
