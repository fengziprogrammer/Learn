package com.atguigu.date.jdk8;

import java.time.LocalDateTime;

public class Demo1_LocalDateTime {

    /*
        JDK1.8之后的日期时间类
     */
    public static void main(String[] args) {

        LocalDateTime dateTime1 = LocalDateTime.now();
        LocalDateTime dateTime2 =
                LocalDateTime.of(2026, 8, 20, 11, 11, 11);

        System.out.println(dateTime1);// 2023-06-17T11:49:07.002
        System.out.println(dateTime2);// 2026-08-20T11:11:11

        // 常用的方法
        System.out.println(dateTime1.getYear());
        System.out.println(dateTime1.getMonth());// JUNE
        System.out.println(dateTime1.getMonthValue());//6
        System.out.println(dateTime1.getDayOfYear());
        System.out.println(dateTime1.getDayOfMonth());
        System.out.println(dateTime1.getDayOfWeek());// SATURDAY
        System.out.println(dateTime1.getHour());
    }
}
