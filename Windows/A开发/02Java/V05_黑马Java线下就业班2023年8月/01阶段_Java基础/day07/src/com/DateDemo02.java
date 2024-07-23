package com;

import java.util.Date;

/*
    Date类的getTime方法: 获取Date对象封装的毫秒值
    System类的currentTimeMillis方法: 获取当前系统时间记录的毫秒值
 */
public class DateDemo02 {
    public static void main(String[] args) {
        //创建日期对象,封装当前系统时间
        Date d = new Date();

        //getTime()获取Date对象封装的毫秒值 (代表从时间原点, 到现在所经历的毫秒值)
        long time = d.getTime();
        System.out.println(time); //1665562195045

        //System类有一个方法currentTimeMillis(), 也可以获取当前系统时间记录的毫秒值
        long time2 = System.currentTimeMillis();
        System.out.println(time2); //1665562195045

        //毫秒值 / 24*60*60*1000 = 经历的天数了

        //获取开始的时间节点
        long start = System.currentTimeMillis(); //小
        String s = "";
        for (int i = 1; i <= 500000000 ; i++) {
            //完成5万次字符串的拼接 -> 1秒左右
            s += i;
        }
        //获取结束的时间节点
        long end = System.currentTimeMillis(); //大
        //计算某一段代码运行的时间
        System.out.println(end - start); //1159 1秒左右
    }
}
