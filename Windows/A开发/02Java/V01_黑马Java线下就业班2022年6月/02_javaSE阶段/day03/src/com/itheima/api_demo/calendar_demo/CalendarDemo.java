package com.itheima.api_demo.calendar_demo;

import java.util.Calendar;

/*
    Calendar类 : Calendar 类是一个抽象类

    Calendar获取对象的方式
        与其他语言环境敏感类一样，Calendar 提供了一个类方法 getInstance，以获得此类型的一个通用的对象。
        Calendar 的 getInstance 方法返回一个 Calendar 对象，其日历字段已由当前日期和时间初始化：
        Calendar rightNow = Calendar.getInstance();
        public static Calendar getInstance()	获取一个它的子类GregorianCalendar对象。

    成员方法 :
        public int  get(int field)	返回给定日历字段的值
        public void set(int field,int value)	设置指定字段的时间值
        public void add(int field,int amount)	为某个字段增加/减少指定的值

    月份对应的关系
    字段时间值     :       0           1           ....        11
    正真的时间     :     JANUARY     FEBRUARY      ....      DECEMBER

    成员方法 :
        public int  get(int field)	返回给定日历字段的值
        public void set(int field,int value)	设置指定字段的时间值
        public void add(int field,int amount)	为某个字段增加/减少指定的值
 */
public class CalendarDemo {
    public static void main(String[] args) {
        // 多态
        Calendar rightNow = Calendar.getInstance();

        //  public void add(int field,int amount)	为某个字段增加/减少指定的值
        rightNow.add(Calendar.DAY_OF_MONTH , 21);


        //  public void set(int field,int value)	设置指定字段的时间值
//        rightNow.set(Calendar.YEAR , 2048);
//        rightNow.set(Calendar.MONTH , 10);
//        rightNow.set(Calendar.DAY_OF_MONTH , 11);

        // System.out.println(rightNow);// 打印的是当前系统时间
        // public int  get(int field)	返回给定日历字段的值
        int year = rightNow.get(Calendar.YEAR);
        int month = rightNow.get(Calendar.MONTH);
        int day = rightNow.get(Calendar.DAY_OF_MONTH);
        int week = rightNow.get(Calendar.DAY_OF_WEEK);

        System.out.println(year);  // 2021
        System.out.println(month); // 10
        System.out.println(day);   // 10
        System.out.println(getWeek(week));  // 4
    }

    // 接收一个字段值 , 返回对应的星期
    public static String getWeek(int filed) {// 7
        String[] str = {"", "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
        return str[filed];
    }
}
