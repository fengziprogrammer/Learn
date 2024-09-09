package com.itheima.api_demo.localdatetime_demo;

import java.time.LocalDateTime;

/*
    LocalDateTime获取功能
        public int getYear()			    获取年
        public int getMonthValue()		    获取月份（1-12）
        public int getDayOfMonth()		    获取月份中的第几天（1-31）
        public int getDayOfYear()		    获取一年中的第几天（1-366）
        public DayOfWeek getDayOfWeek()		获取星期
        public int getHour()			    获取小时
        public int getMinute()			    获取分钟

 */
public class LocalDateTimeDemo2 {
    public static void main(String[] args) {
        // 获取当前系统时间
        LocalDateTime now = LocalDateTime.now();

//        public int getYear()			        获取年
        System.out.println(now.getYear());
//        public int getMonthValue()		    获取月份（1-12）
        System.out.println(now.getMonthValue());
//        public int getDayOfMonth()		    获取月份中的第几天（1-31）
        System.out.println(now.getDayOfMonth());

//        public int getDayOfYear()		        获取一年中的第几天（1-366）
        System.out.println(now.getDayOfYear());
//        public DayOfWeek getDayOfWeek()		获取星期
        System.out.println(now.getDayOfWeek());
//        public int getHour()			        获取小时
        System.out.println(now.getHour());
//        public int getMinute()			    获取分钟
        System.out.println(now.getMinute());

        System.out.println(now.getSecond());

    }
}
