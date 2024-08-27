package com.atguigu.c_thread;

public class Test01 {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.setName("曼曼");
        myThread.start();
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000L);
            System.out.println(Thread.currentThread().getName()+"线程开始执行............"+i);
        }
    }
}
