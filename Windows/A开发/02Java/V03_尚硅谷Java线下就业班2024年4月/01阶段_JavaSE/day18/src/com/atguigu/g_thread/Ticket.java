package com.atguigu.g_thread;

public class Ticket implements Runnable{
    //定义一个成员变量,代表车票,初始化为100
    static int ticket = 100;

    //Object obj = new Object();

    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            method();
        }
    }

    //静态的同步方法
   /* public static synchronized void method(){
        if (ticket>0){
            System.out.println(Thread.currentThread().getName()+"买了第"+ticket+"张票");
            ticket--;
        }
    }*/

    public static void method(){
        synchronized (Ticket.class){
            if (ticket>0){
                System.out.println(Thread.currentThread().getName()+"买了第"+ticket+"张票");
                ticket--;
            }
        }

    }
}
