package com.atguigu.e_threadpool;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"执行了");
    }
}
