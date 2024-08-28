package com.itheima.date.calendar;

import java.util.Calendar;

public class CalendarTest5 {
    //演示：Calendar日历类的使用
    public static void main(String[] args) {
        //获取Calendar类对象
        Calendar c = Calendar.getInstance();

        //计算10天之后的年月日
        c.add(Calendar.DATE , 35);

        System.out.println(c);
    }
}
