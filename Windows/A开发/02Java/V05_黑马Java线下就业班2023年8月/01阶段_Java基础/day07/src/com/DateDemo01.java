package com;



/*
    Date类表示特定的时刻,单位为毫秒

    时间换算公式
        1秒 = 1000毫秒 (常用)
        1毫秒 = 1000微妙
        1微妙 = 1000纳秒

    时间原点的由来 : 1970年01月01日
        1960年8月, 贝尔实验室的程序员使用B语言在老旧的PDP-7机器上开发出了Unix的一个版本
        随后改进了B语言, 开发了C语言, 重写了UNIX
        所以认为1970年1月1日是C语言的生日, Java延续了这一传统

    Date构造方法:
        Date(); 空参构造创建对象,代表当前系统时间
        Date(long 毫秒值); 带参构造创建对象,参数表示从时间原点开始,经过的毫秒值

   注意: 导包使用util包下的Date
 */

import java.util.Date;

public class DateDemo01 {
    public static void main(String[] args) {
        //空参创建Date对象 -> 系统时间 -> 常用
        Date d1 = new Date();
        System.out.println(d1); //Wed Oct 12 15:54:20 CST 2022

        //带参创建Date对象 -> 设置时间 -> 不常用
        Date d2 = new Date(0L); //从时间原点,经历了0毫秒的时间节点 -> 就是时间原点
        System.out.println(d2); //Thu Jan 01 08:00:00 CST 1970

        //带参创建Date对象 -> 设置时间 -> 不常用
        Date d3 = new Date(60 * 60 * 1000L); //从时间原点,经历了1个小时的时间节点 -> 60*60*1000
        System.out.println(d3); //Thu Jan 01 09:00:00 CST 1970
    }
}
