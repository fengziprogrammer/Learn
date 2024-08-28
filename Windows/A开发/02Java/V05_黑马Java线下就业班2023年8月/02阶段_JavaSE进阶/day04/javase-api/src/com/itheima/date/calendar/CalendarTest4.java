package com.itheima.date.calendar;

import java.util.Calendar;

public class CalendarTest4 {
    //演示：Calendar日历类的使用
    public static void main(String[] args) {
        //获取Calendar类对象
        Calendar c = Calendar.getInstance();

        //设置：年月日
        c.set(2022, 9, 1);

        //获取星期
        int week = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(week);

    }
}
