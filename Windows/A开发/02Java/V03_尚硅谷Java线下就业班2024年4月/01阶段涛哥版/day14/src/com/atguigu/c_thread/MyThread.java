package com.atguigu.c_thread;

public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(2000L);
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"线程开始执行了........"+i);
        }
    }
}
