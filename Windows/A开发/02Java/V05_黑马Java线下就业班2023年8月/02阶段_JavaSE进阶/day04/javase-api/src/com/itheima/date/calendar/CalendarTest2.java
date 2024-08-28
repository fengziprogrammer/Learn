package com.itheima.date.calendar;

import java.util.Calendar;

public class CalendarTest2 {
    //演示：Calendar日历类的使用
    public static void main(String[] args) {
       //获取Calendar类对象
        Calendar c  = Calendar.getInstance();
        System.out.println( c.get(Calendar.YEAR) );

        //修改日历中的年份，修改为：2000
        c.set(Calendar.YEAR ,2000);
        System.out.println(c.get(Calendar.YEAR));

        //修改日历对象中的年月日
        c.set(2023,0,30);//月份：0~11
        System.out.println(c);
    }
}
