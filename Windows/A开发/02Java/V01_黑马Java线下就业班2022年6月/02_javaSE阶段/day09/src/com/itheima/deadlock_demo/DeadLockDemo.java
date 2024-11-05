package com.itheima.deadlock_demo;

/*
    死锁 :
        死锁是一种少见的，而且难于调试的错误
        在两个线程对两个同步锁对象具有循环依赖时(同步锁嵌套使用)，就会大概率的出现死锁。
        我们要避免死锁的产生。否则一旦死锁，除了重启没有其他办法的
 */
public class DeadLockDemo {
    public static void main(String[] args) {
        String 筷子A = "筷子A";
        String 筷子B = "筷子B";

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (筷子A) {
                        System.out.println("小明拿到了筷子A , 等待筷子B...");
                        synchronized (筷子B) {
                            System.out.println("小明拿到了筷子A和筷子B , 开吃....");
                        }
                    }
                }
            }
        }, "小明").start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (筷子B) {
                        System.out.println("小红拿到了筷子B , 等待筷子A...");
                        synchronized (筷子A) {
                            System.out.println("小红拿到了筷子A和筷子B , 开吃....");
                        }
                    }
                }
            }
        }, "小红").start();
    }
}
