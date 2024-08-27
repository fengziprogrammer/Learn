package com.atguigu.g_ticket;

public class MyTicket implements Runnable {
    int ticket = 100;

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            method();
        }
    }

   /* public synchronized void method() {
        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + "买了第" + ticket + "张票");
            ticket--;
        }
    }*/

    public void method(){
        synchronized (this){
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "买了第" + ticket + "张票");
                ticket--;
            }
        }
    }
}
