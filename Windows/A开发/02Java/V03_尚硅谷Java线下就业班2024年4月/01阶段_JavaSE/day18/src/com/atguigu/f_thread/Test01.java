package com.atguigu.f_thread;

public class Test01 {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();

        Thread t1 = new Thread(ticket,"曼曼");
        Thread t2 = new Thread(ticket,"涛哥");
        Thread t3 = new Thread(ticket,"柳岩");

        t1.start();
        t2.start();
        t3.start();
    }
}
