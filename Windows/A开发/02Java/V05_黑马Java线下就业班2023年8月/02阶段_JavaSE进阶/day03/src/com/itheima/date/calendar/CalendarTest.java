package com.itheima.date.calendar;

import java.util.Calendar;

public class CalendarTest {
    //演示：Calendar日历类的使用
    public static void main(String[] args) {
       //获取Calendar类对象
        Calendar c  = Calendar.getInstance();
        System.out.println( c );

        //获取日历对象中的：年、月、日
        int year = c.get( Calendar.YEAR );
        int month = c.get( Calendar.MONTH );//月份范围 ： 0~11
        int day = c.get( Calendar.DAY_OF_MONTH );

        System.out.println(year+"年"+(month+1)+"月"+day+"日");
    }
}
