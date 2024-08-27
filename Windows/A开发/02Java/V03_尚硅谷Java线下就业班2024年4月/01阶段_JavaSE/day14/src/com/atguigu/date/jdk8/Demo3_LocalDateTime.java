package com.atguigu.date.jdk8;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Demo3_LocalDateTime {

    /*
        日期时间类的   格式转换的功能
            日期 <-> 字符串
     */
    public static void main(String[] args) {

        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");

        LocalDateTime dateTime2 =
                LocalDateTime.of(2026, 8, 20, 11, 11, 11);

        String s = dateTime2.format(pattern);
        System.out.println(s);
        System.out.println("----------------------");

        String s2 = "2026年08月20日 11:11:11";
        LocalDateTime dateTime = LocalDateTime.parse(s2, pattern);
        System.out.println(dateTime);

    }
}
