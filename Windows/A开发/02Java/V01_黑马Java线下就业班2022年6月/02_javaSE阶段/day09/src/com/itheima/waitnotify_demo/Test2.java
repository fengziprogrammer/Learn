package com.itheima.waitnotify_demo;

/*
    2 线程进入无限等待后被唤醒
        注意：等待和唤醒是两个或多个线程之间实现的。进入无限等待的线程是不会自动唤醒，只能通过其他线程来唤醒。

        wait() : 释放锁
        notify : 不释放锁
        notifyAll : 不释放锁


        A线程开始执行
        A线程进入无线等待状态...

        等待3秒钟

        B线程开始执行
        B线程唤醒A线程...
        B线程执行完毕...

        等待3秒钟

        A线程执行完毕...
 */
public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        Object obj = new Object();
        Object obj2 = new Object();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("A线程开始执行");
                synchronized (obj) {
                    try {
                        System.out.println("A线程进入无线等待状态...");
                        obj.wait();// 释放锁
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("A线程执行完毕...");
                }

            }
        }, "A").start();

        Thread.sleep(3000);

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("B线程开始执行");
                synchronized (obj) {
                    try {
                        System.out.println("B线程唤醒A线程...");
                        obj.notify();// 不释放锁
                        System.out.println("B线程执行完毕...");
                        Thread.sleep(3000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }// 释放锁

            }
        }, "B").start();
    }
}