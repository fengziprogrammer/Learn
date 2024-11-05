package com.itheima.homework.test7;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
    请使用继承Thread类的方式定义一个线程类，在run()方法中循环10次
    每1秒循环1次，每次循环按“yyyy-MM-dd HH:mm:ss”的格式打印当前系统时间。

    请定义测试类，并定义main()方法，启动此线程，观察控制台打印。
 */
public class Test7 {
    public static void main(String[] args) {
        new MyThread().start();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String strDate = sdf.format(date);
            System.out.println(strDate);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
