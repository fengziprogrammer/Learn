package com.itheima.date.calendar;

import java.util.Calendar;

public class CalendarCase1 {
    //演示：创建日历对象，并获取其时间值
    public static void main(String[] args) {
        //创建对象
        Calendar c = Calendar.getInstance();//实例化

        //通过get方法，指定日历字段，获取日历中的时间值
        System.out.println("年："+c.get(Calendar.YEAR));
        System.out.println("月："+(c.get(Calendar.MONTH)+1));//月份，从0开始， 0~11
        System.out.println("日："+c.get(Calendar.DATE));
        System.out.println("时："+c.get(Calendar.HOUR_OF_DAY));
        System.out.println("分："+c.get(Calendar.MINUTE));
        System.out.println("秒："+c.get(Calendar.SECOND));
        System.out.println("周："+c.get(Calendar.DAY_OF_WEEK));//DAY_OF_WEEK 表示一周的第几天
    }
}
