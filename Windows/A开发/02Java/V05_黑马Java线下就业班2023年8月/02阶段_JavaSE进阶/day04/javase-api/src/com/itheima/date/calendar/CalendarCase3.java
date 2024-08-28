package com.itheima.date.calendar;

import java.util.Calendar;

public class CalendarCase3 {
    //演示：计算是1000天之后是哪一年
    public static void main(String[] args) {
        //创建对象
        Calendar c = Calendar.getInstance();//实例化

        //计算日历中的天数
        c.add(Calendar.DATE , 10000); //在当前日历的天数的基础上，加指定的天数

        //获取日历中的年月日
        System.out.println("年："+c.get(Calendar.YEAR));
        System.out.println("月："+c.get(Calendar.MONTH));
        System.out.println("日："+c.get(Calendar.DAY_OF_MONTH));

    }
}
