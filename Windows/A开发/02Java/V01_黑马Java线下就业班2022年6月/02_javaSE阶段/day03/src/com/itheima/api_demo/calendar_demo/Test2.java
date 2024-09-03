package com.itheima.api_demo.calendar_demo;

import java.util.Calendar;

/*
    2 写代码实现，获取2022年10月1日是星期几？
        参考思路：
        直接获取日历对象，得到的是当前系统的日历时间信息。
        获取日历对象后，要重新设置日期
        再获取星期数据
 */
public class Test2 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        cal.set(Calendar.YEAR , 2022);
        cal.set(Calendar.MONTH , 9);
        cal.set(Calendar.DAY_OF_MONTH , 1);

        int filed = cal.get(Calendar.DAY_OF_WEEK);
        String week = CalendarDemo.getWeek(filed);
        System.out.println(week);
    }
}