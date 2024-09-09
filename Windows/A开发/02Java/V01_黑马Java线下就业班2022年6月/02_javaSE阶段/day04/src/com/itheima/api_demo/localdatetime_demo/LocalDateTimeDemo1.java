package com.itheima.api_demo.localdatetime_demo;

import java.time.LocalDateTime;

/*
    LocalDateTime创建方法
        public static LocalDateTime now() : 获取当前系统时间
	    public static LocalDateTime of  (年, 月 , 日, 时, 分, 秒) : 使用指定年月日和时分秒初始化一个LocalDateTime对象

	练习 : 使用LocalDateTime类的两种方式创建对象
 */
public class LocalDateTimeDemo1 {
    public static void main(String[] args) {
        // public static LocalDateTime now() : 获取当前系统时间
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);// 当前系统时间

        // public static LocalDateTime of  (年, 月 , 日, 时, 分, 秒) : 使用指定年月日和时分秒初始化一个LocalDateTime对象
        LocalDateTime time = LocalDateTime.of(2021, 11, 12, 11, 11, 11);
        System.out.println(time);
    }
}
