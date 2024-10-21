package com.atguigu.d_lock;

public class Test01 {
    public static void main(String[] args) {
        MyTicket myTicket = new MyTicket();
        Thread t1 = new Thread(myTicket,"曼曼");
        Thread t2 = new Thread(myTicket,"涛哥");
        Thread t3 = new Thread(myTicket,"柳岩");
        t1.start();
        t2.start();
        t3.start();
    }
}
