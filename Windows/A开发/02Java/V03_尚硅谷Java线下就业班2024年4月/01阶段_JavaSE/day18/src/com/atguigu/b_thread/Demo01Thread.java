package com.atguigu.b_thread;

public class Demo01Thread {
    public static void main(String[] args) throws InterruptedException {
        //创建线程类对象
        MyThread myThread = new MyThread();
        myThread.setName("迪迦");//设置线程名字
        myThread.start();//开启线程,jvm自动执行run方法

        //myThread.start();//开启线程,jvm自动执行run方法

        //MyThread myThread1 = new MyThread();
        //myThread1.start();

        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000L);

            System.out.println(Thread.currentThread().getName()+"...执行了"+i);
        }
    }
}
