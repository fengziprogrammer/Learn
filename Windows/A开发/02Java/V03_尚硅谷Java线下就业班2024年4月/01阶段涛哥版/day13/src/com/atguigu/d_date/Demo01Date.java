package com.atguigu.d_date;

import java.util.Date;

public class Demo01Date {
    public static void main(String[] args) {
        //Date() -> 分配 Date 对象并初始化此对象，以表示分配它的时间（精确到毫秒）。
        Date date = new Date();
        System.out.println("date = " + date);
        //Date(long time) -> 分配 Date 对象并初始化此对象-> 从时间原点开始算的->传递毫秒值
        Date date1 = new Date(1000L);
        System.out.println("date1 = " + date1);
    }
}
