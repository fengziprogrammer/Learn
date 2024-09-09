package com.itheima.api_demo.localdatetime_demo;

import java.time.LocalDateTime;

/*
    时间的增加或减少
        public LocalDateTime plusYears (long years)	    添加或者减去年
        public LocalDateTime plusMonths(long months)	添加或者减去月
        public LocalDateTime plusDays(long days)		添加或者减去日
        public LocalDateTime plusHours(long hours)	    添加或者减去时
        public LocalDateTime plusMinutes(long minutes)	添加或者减去分
        public LocalDateTime plusSeconds(long seconds)	添加或者减去秒
        public LocalDateTime plusWeeks(long weeks)	    添加或者减去周

    时间的修改
        public LocalDateTime withYear(int year)		        直接修改年
        public LocalDateTime withMonth(int month)		    直接修改月
        public LocalDateTime withDayOfMonth(int dayofmonth)	直接修改日期(一个月中的第几天)
        public LocalDateTime withDayOfYear(int dayOfYear)	直接修改日期(一年中的第几天)
        public LocalDateTime withHour(int hour)		        直接修改小时
        public LocalDateTime withMinute(int minute)	        直接修改分钟
        public LocalDateTime withSecond(int second)	        直接修改秒
 */
public class LocalDateTimeDemo3 {
    public static void main(String[] args) {
        // 指定时间
        LocalDateTime time = LocalDateTime.of(2021, 11, 11, 11, 11, 11);

        //  时间的增加或减少
        // public LocalDateTime plusYears (long years)	    添加或者减去年
        LocalDateTime newLocalDateTime = time.plusYears(1);
        System.out.println(newLocalDateTime);

        LocalDateTime newLocalDateTime2 = time.plusYears(-2);
        System.out.println(newLocalDateTime2);

        // 时间的修改
        LocalDateTime localDateTime = time.withMonth(6);
        System.out.println(localDateTime);
    }
}
