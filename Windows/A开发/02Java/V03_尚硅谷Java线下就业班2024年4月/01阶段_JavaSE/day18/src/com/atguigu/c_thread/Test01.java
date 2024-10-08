package com.atguigu.c_thread;

public class Test01 {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable myRunnable = new MyRunnable();
        //将myRunnable封装到Thread中

        //Thread t1 = new Thread(myRunnable);

        //Thread(Runnable target, String name)
        Thread t1 = new Thread(myRunnable, "曼曼");
        //调用start方法,开启线程
        t1.start();

        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000L);
            System.out.println(Thread.currentThread().getName()+"...执行了"+i);
        }
    }
}
