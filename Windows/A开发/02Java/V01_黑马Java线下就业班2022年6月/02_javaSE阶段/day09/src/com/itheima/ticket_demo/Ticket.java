package com.itheima.ticket_demo;

//1 定义一个类Ticket实现Runnable接口，里面定义一个成员变量：private int ticketCount = 100;
public class Ticket implements Runnable {
    private int ticketCount = 100;// 票的总数// 1

    @Override
    public void run() {
        while (true) {
            //   A：判断票数大于0，就卖票，并告知是哪个窗口卖的
            if (ticketCount > 0) {
                //  B：票数要减1
                ticketCount--;
                System.out.println(Thread.currentThread().getName() + "卖出了一张票,还剩余" + ticketCount);
            } else {
                // ticketCount <= 0
                break;
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
