package com.itheima.thread_demo.thread_method;
/*
    Thread类
        public void join() : 具备阻塞作用 , 等待这个线程死亡,才会执行其他线程
 */
public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                }
            }
        }  , "线程1");
        thread.start();
        thread.join();// 阻塞

        for (int i = 1; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
