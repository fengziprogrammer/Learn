package com.atguigu.e_ticket;

public class Test01 {
    public static void main(String[] args) {
        MyTicket myTicket = new MyTicket();
        Thread t1 = new Thread(myTicket,"曼曼");
        Thread t2 = new Thread(myTicket,"童童");
        Thread t3 = new Thread(myTicket,"雪雪");
        t1.start();
        t2.start();
        t3.start();
    }
}
