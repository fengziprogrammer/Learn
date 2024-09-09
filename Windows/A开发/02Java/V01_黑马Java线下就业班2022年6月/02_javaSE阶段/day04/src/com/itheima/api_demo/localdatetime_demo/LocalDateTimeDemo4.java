package com.itheima.api_demo.localdatetime_demo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
    LocalDateTime格式化和解析
        public String format (日期格式化器对象) : 把一个LocalDateTime格式化成为一个字符串
        public static LocalDateTime parse (准备解析的字符串, 日期格式化器对象) : 把一个日期字符串解析成为一个LocalDateTime对象
    DateTimeFormatter类
        public static DateTimeFormatter ofPattern(String pattern) : 使用指定的日期模板获取一个日期格式化器DateTimeFormatter对象
 */
public class LocalDateTimeDemo4 {
    public static void main(String[] args) {
        // 解析 : String --> LocalDateTime
        String s = "2021-11-12 11:11:12";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.parse(s, dateTimeFormatter);
        System.out.println(localDateTime);
    }

    private static void method() {
        // 格式化 : LocalDateTime --> String
        LocalDateTime now = LocalDateTime.now();
        // System.out.println(now);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        // 2021年11月11日 14:06:55
        String strDate = now.format(dateTimeFormatter);
        System.out.println(strDate);
    }
}
