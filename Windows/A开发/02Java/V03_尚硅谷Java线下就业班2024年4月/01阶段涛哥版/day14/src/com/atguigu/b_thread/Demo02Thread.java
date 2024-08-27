package com.atguigu.b_thread;

public class Demo02Thread {
    public static void main(String[] args) {
        //创建线程对象
        MyThread myThread = new MyThread();
        //调用Thread中的start方法,开启线程,jvm自动执行run方法
        myThread.start();
        myThread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("main方法.............执行了"+i);
        }
    }
}
