package com.atguigu.date;

import java.util.Date;

public class Demo1_Date {

    /*
    Date 表示特定的瞬间，精确到毫秒
           默认的格式  Sat Jun 17 11:13:50 CST 2023

    构造方法
        - public Date()  如果没有传参数代表的是当前系统时间
        - public Date(long date) 把该毫秒值换算成日期时间对象,如果构造方法中参数传为0代表的是1970年1月1日   元年

    成员方法
        - public long getTime() 当前系统时间距离1970-1-1 0:0:0 0毫秒的时间差，毫秒为单位
          与System.currentTimeMillis()功能相似
        - public void setTime(long time)  设置毫秒值,改变时间对象


        date类 不足
        1> 很多方法以及过时了
        2> 功能有限
            对于自定义某个时间 不友好
                例: 自定义一个时间 2026年8月8日 08:08:08
     */
    public static void main(String[] args) {

        // Date date = new Date(2000);// 定义一个时间对象,参数就是与计算机元年的差值

        Date date = new Date();//当前系统时间
        System.out.println(date);//
        System.out.println(date.getTime());

        date.setTime(2000);
        System.out.println(date);
        System.out.println(date.getTime());// 1686971528981当前系统时间与计算机元年的差值   毫秒值



    }
}
