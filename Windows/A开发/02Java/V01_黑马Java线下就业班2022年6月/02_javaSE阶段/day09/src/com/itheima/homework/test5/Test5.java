package com.itheima.homework.test5;

/*
    请使用继承Thread类的方式定义一个线程类，在run()方法中使用循环变量i遍历1--1000所有的数字。
        1 定义main()方法，启动这个线程，然后再使用循环变量k遍历1--1000所有的数字。
        2 请观察控制台打印，i和k交叉打印的情况
 */
public class Test5 {
    public static void main(String[] args) {
        MyThread mt = new MyThread("线程1:");
        mt.start();
        for (int k = 0; k < 1000; k++) {
            System.out.println(Thread.currentThread().getName() + ": " + k);
        }
    }
}

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}
