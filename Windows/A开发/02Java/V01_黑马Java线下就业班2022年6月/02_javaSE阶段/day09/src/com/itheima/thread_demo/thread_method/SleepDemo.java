package com.itheima.thread_demo.thread_method;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
    需求 : 在主线程中创建一个新的线程(实现Runnable接口)
    在新线程中 , 打印当前时间 "yyyy年MM月dd HH:mm:ss"

    2021年11月18 10:23:11
    2021年11月18 10:23:12
    2021年11月18 10:23:13
    2021年11月18 10:23:14
    2021年11月18 10:23:15
    ...

    Thread类
        public static void sleep(long time) : 当前线程进行休眠 , time代表的是毫秒值

 */
public class SleepDemo {
    public static void main(String[] args) throws InterruptedException {
        // public static void sleep(long time)：让线程休眠指定的时间，单位为毫秒。
//        Thread.sleep(3000);
//        System.out.println("执行了....");

       new Thread(new Runnable() {
           @Override
           public void run() {
              SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd HH:mm:ss:SSS");
              while(true){
                  // 当前系统时间
                  Date d = new Date();
                  String s = sdf.format(d);
                  System.out.println(s);
                  try {
                      Thread.sleep(1000);
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
              }
           }
       }).start();
    }
}
