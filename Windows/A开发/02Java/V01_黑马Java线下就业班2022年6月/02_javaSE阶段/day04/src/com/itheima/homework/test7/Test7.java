package com.itheima.homework.test7;

import java.util.Calendar;

public class Test7 {
    public static void main(String[] args) {
        // 拿到当前时间
        Calendar now = Calendar.getInstance();

        System.out.println(now.get(Calendar.YEAR));
        System.out.println(now.get(Calendar.MONTH));
        System.out.println(now.get(Calendar.DAY_OF_MONTH));
        System.out.println(now.get(Calendar.HOUR));
        System.out.println(now.get(Calendar.MINUTE));
        System.out.println(now.get(Calendar.SECOND));

        int week = now.get(Calendar.DAY_OF_WEEK);// 7
        System.out.println(getWeek(week));// 字段值
    }

    public static String getWeek(int field){
        String[] str = { "" , "SUNDAY" , "MONDAY" , "TUESDAY" , "WEDNESDAY" , "THURSDAY" , "FRIDAY" , "SATURDAY"};
        return str[field];
    }
}
