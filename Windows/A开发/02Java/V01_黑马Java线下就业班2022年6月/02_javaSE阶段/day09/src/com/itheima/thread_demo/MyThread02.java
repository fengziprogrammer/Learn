package com.itheima.thread_demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/*
    线程的创建方式2 ：实现Runnable方式

    基本步骤 :
        1 定义任务类,实现Runnable，并重写run方法
        2 创建任务对象
        3 创建Thread类型的对象 , Thread类的构造方法需要接受一个Runnable实现类对象
        4 调用线程的start方法，开启线程

        Thread类
            public Thread(Runnable target) : 接受一个Runnable接口的实现类对象
            public Thread(Runnable target , String name) :
                第一个参数 : 接受一个Runnable接口的实现类对象
                第二个参数 : 给线程设置名字
    需求 :
        我们启动一个Java程序，其实默认就存在一个主线程（main方法所在线程）
        接下来，我们在主线程启动一个线程，打印1到100的数字，主线程启动完线程后又打印1到100的数字。
        此时主线程和启动的线程在并发执行，观察控制台打印的结果。
 */
public class MyThread02 {
    public static void main(String[] args) {
        //  2 创建任务对象
        MyRunnable myRunnable = new MyRunnable();

        //  3 创建Thread类型的对象 , Thread类的构造方法需要接受一个Runnable实现类对象
        // public Thread(Runnable target) : 接受一个Runnable接口的实现类对象
        // Thread t = new Thread(myRunnable);
        // public Thread(Runnable target , String name) :
        Thread t = new Thread(myRunnable, "线程1");
        //  4 调用线程的start方法，开启线程
        t.start();

        for (int i = 1; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }

        System.out.println("=========================");

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("新线程的任务代码...");
            }
        }).start();

        new Thread(() -> {
            System.out.println("新线程的任务代码....");
        }).start();

    }
}

//  1 定义任务类,实现Runnable，并重写run方法
class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}


