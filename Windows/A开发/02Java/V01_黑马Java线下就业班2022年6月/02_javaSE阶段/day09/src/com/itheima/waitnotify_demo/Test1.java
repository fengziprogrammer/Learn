package com.itheima.waitnotify_demo;

/*
    Object类 :  wait()

    1 线程进入无限等待 : wait()方法
        注意：进入无限等待需要使用锁在同步代码中调用wait方法
 */
public class Test1 {
    public static void main(String[] args) {
        Object obj = new Object();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程开始执行");
                synchronized (obj) {
                    try {
                        System.out.println("线程进入无线等待状态...");
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("线程执行完毕...");
            }
        }).start();
    }
}
