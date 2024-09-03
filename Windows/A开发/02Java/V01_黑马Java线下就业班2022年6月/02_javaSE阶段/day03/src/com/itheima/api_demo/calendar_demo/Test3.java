package com.itheima.api_demo.calendar_demo;

import java.util.Calendar;

/*
    3 计算10000天之后的年月日

    参考思路：
    先获取当前日历对象
    再调用add方法，指定DATE或者DAY_OF_MONTH，添加10000天
    再获取日历的年，月，日
 */
public class Test3 {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();

        now.add(Calendar.DAY_OF_MONTH , 10000);

        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH);
        int day = now.get(Calendar.DAY_OF_MONTH);

        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
    }
}
