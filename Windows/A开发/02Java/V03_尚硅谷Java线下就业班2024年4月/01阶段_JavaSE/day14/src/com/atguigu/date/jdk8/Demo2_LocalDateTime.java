package com.atguigu.date.jdk8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Demo2_LocalDateTime {

    /*
    LocalDateTime 转换方法
     */
    public static void main(String[] args) {

        LocalDateTime dateTime2 =
                LocalDateTime.of(2026, 8, 20, 11, 11, 11);
        System.out.println("dateTime2 = " + dateTime2);
        LocalDate localDate = dateTime2.toLocalDate();
        System.out.println("localDate = " + localDate);
        LocalTime localTime = dateTime2.toLocalTime();
        System.out.println("localTime = " + localTime);

    }
}
