package com.atguigu.date.jdk8;

import java.time.LocalDateTime;

public class Demo4_LocalDateTime {

    /*
        对时间进行增加或减少,设置功能
     */
    public static void main(String[] args) {

        LocalDateTime dateTime = LocalDateTime.of(2011,11,11,11,11,11);
        System.out.println(dateTime.getYear());
        /*System.out.println(dateTime.plusYears(1).getYear());
        System.out.println(dateTime.plusYears(-1).getYear());*/

        System.out.println(dateTime.minusYears(3).getYear());
        System.out.println(dateTime.minusYears(-3).getYear());


        System.out.println(dateTime.minusMonths(3));
        System.out.println(dateTime.minusMonths(-3));//2011 11 + 3 智能增加

        System.out.println("------------------------------");

        System.out.println(dateTime.withYear(2008));
    }
}
