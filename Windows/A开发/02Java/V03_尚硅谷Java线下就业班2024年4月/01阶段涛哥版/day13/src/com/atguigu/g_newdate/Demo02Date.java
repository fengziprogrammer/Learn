package com.atguigu.g_newdate;

import java.time.LocalDateTime;

public class Demo02Date {
    public static void main(String[] args) {
       //a.static LocalDateTime now()
        LocalDateTime localDateTime1 = LocalDateTime.now();
        System.out.println("localDateTime1 = " + localDateTime1);
        //static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute, int second)
        LocalDateTime localDateTime2 =
                LocalDateTime.of(2000, 12, 12, 12, 12, 12);
        System.out.println("localDateTime2 = " + localDateTime2);
    }
}
