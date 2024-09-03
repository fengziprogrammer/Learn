package com.itheima.api_demo.calendar_demo;

import java.util.Calendar;

/*
    1 写代码使用get方法，将年，月，日，时，分，秒，周获取出来
    特别注意获取月份，和星期有以下特点：
    直接获取的月份数据是从0开始的， 0表示1月，.....11表示12月
    周的获取，从周日开始计算，1就是周日，2就是周一 ......7就是周六


星期对应的关系
     字段时间值  :   1           2            3          ...        7
     真正的时间  : SUNDAY        MONDAY      TUESDAY     ...        SATURDAY

月份对应的关系
    字段时间值     :       0           1           ....        11
    正真的时间     :     JANUARY     FEBRUARY      ....      DECEMBER
 */
public class Test1 {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();

        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH);
        int day = now.get(Calendar.DAY_OF_MONTH);
        int hour = now.get(Calendar.HOUR_OF_DAY);
        int minute = now.get(Calendar.MINUTE);
        int second = now.get(Calendar.SECOND);
        int week = now.get(Calendar.DAY_OF_WEEK);

        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        System.out.println(hour);
        System.out.println(minute);
        System.out.println(second);
        System.out.println(week);
    }
}
