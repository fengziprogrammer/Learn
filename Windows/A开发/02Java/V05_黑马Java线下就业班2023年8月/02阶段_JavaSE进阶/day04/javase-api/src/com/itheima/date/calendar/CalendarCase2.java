package com.itheima.date.calendar;

import java.util.Calendar;

public class CalendarCase2 {
    //演示：根据给定的日期，计算是星期几
    public static void main(String[] args) {
        //创建对象
        Calendar c = Calendar.getInstance();//实例化

        //设置日历的年月日：2022年10月1
        c.set(2022,9,1); //月份：0~11

        int week = c.get(Calendar.DAY_OF_WEEK);
        System.out.println("2022年10月1日是：星期"+week);

//        switch (week){
//            case 1:
//                System.out.println("星期天");
//                break;
//            case 2:
//                System.out.println("星期一");
//                break;
//        }
    }
}
