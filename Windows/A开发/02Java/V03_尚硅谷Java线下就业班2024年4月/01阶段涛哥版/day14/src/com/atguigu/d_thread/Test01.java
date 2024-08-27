package com.atguigu.d_thread;

public class Test01 {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable myRunnable = new MyRunnable();
        Thread t1 = new Thread(myRunnable,"曼曼");
        t1.start();
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000L);
            System.out.println(Thread.currentThread().getName()+"...执行了"+i);
        }
    }
}
