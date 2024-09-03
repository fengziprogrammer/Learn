package com.itheima.api_demo.date_demo;

import com.itheima.homework.work.Student;

import java.util.Date;

/*
    Date类 : 类 Date 表示特定的瞬间，精确到毫秒

    构造方法 :
        public Date() :          创建Date对象 , 对象代表的是当前系统时间
        public Date(long date) : Date对象 = 1970/1/1 0:0:0  + date毫秒值

    成员方法 :
        public long getTime() : 返回的是long类型的毫秒值 = 当前Date代表的时间 - 1970/1/1 0:0:0
        public void setTime(long time) :  Date对象 = 1970/1/1 0:0:0  + time毫秒值
 */
public class DateDemo {
    public static void main(String[] args) {
        // public Date() :          创建Date对象 , 对象代表的是当前系统时间
        Date d1 = new Date();
        System.out.println(d1);

        // public Date(long date) : Date对象 = 1970/1/1 0:0:0  + date毫秒值
        Date d2 = new Date(1000L * 60 * 60 * 24 * 100);
        System.out.println(d2);

        // public long getTime() : 返回的是long类型的毫秒值 = 当前Date代表的时间 - 1970/1/1 0:0:0
        Date d3 = new Date(1000L * 60 * 60 * 24 ); // 1970/1/2 0:0:0 -  1970/1/1 0:0:0
        System.out.println(d3.getTime());

        // public void setTime(long time) :  Date对象 = 1970/1/1 0:0:0  + time毫秒值
        Date d4 = new Date(1000L * 60 * 60 * 24 * 10);
        d4.setTime(1000L * 60 * 60 * 24);
        System.out.println(d4);

    }
}
