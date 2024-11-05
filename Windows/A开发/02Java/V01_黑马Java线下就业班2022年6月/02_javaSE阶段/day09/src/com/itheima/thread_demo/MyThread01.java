package com.itheima.thread_demo;

import java.text.SimpleDateFormat;

/*
    线程的创建方式1：继承Thread方式

    基本步骤 :
        1 创建一个类继承Thread类。
        2 在类中重写run方法（线程执行的任务放在这里）
        3 创建线程对象，调用线程的start方法开启线程。

    需求 :
        我们启动一个Java程序，其实默认就存在一个主线程（main方法所在线程）
        接下来，我们在主线程启动一个线程，打印1到100的数字，主线程启动完线程后又打印1到100的数字。
        此时主线程和启动的线程在并发执行，观察控制台打印的结果。


         Thread类中设置线程的名字
            void setName(String name)：将此线程的名称更改为等于参数 name
            通过构造方法也可以设置线程名称
 */
public class MyThread01 {
    public static void main(String[] args) {
        // 3 创建线程对象，调用线程的start方法开启线程。
        MyThread myThread = new MyThread("线程1");
        // 设置线程名
        // myThread.setName("线程1");
        // 开启线程
        myThread.start();

        for (int i = 1; i <= 100; i++) {
            // Thread.currentThread() : 获取当前的线程对象
            // Thread.currentThread().getName() : 获取线程的名字
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}

// 1 创建一个类继承Thread类。
class MyThread extends Thread {
    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    //  2 在类中重写run方法（线程执行的任务放在这里）
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(getName() + ":" + i);
        }
    }
}














