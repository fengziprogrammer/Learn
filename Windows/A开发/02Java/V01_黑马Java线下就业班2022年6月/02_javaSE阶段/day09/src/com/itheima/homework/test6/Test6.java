package com.itheima.homework.test6;

/*
 请使用实现Runnable接口的方式定义一个类，在run()方法中使用循环变量i遍历1--1000所有的数字。

    定义main()方法，启动这个线程，然后再使用循环变量k遍历1--1000所有的数字。

    请观察控制台打印，i和k交叉打印的情况。
 */
public class Test6 {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable() , "线程1:");
        thread.start();
        for (int k = 0; k < 1000; k++) {
            System.out.println(Thread.currentThread().getName() + ": " + k);
        }
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}
