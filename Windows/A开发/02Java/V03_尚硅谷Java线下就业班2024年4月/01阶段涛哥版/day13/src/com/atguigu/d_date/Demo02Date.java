package com.atguigu.d_date;

import java.util.Date;

public class Demo02Date {
    public static void main(String[] args) {
        Date date = new Date();
        //long getTime()-> 获取当前系统时间毫秒值
        System.out.println("date.getTime() = " + date.getTime());
        //void setTime(long time)->设置时间,传递毫秒值,从时间原点开始计算
        date.setTime(1000L);
        System.out.println("date = " + date);
    }
}
