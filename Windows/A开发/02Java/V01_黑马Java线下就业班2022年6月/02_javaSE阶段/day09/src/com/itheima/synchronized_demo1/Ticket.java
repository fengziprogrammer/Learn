package com.itheima.synchronized_demo1;

/*
    同步代码块 : 锁住多条语句操作共享数据，可以使用同步代码块实现

    第一部分 : 格式
               synchronized(任意对象) {
                       多条语句操作共享数据的代码
               }

    第二部分 : 注意
               1 默认情况锁是打开的，只要有一个线程进去执行代码了，锁就会关闭
               2 当线程执行完出来了，锁才会自动打开

    第三部分 : 同步的好处和弊端
                好处 : 解决了多线程的数据安全问题
                弊端 : 当线程很多时，因为每个线程都会去判断同步上的锁，这是很耗费资源的，无形中会降低程序的运行效率

 */
public class Ticket implements Runnable {
    private int ticketCount = 100;// 1
    private static final Object OBJ = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (Ticket.class) {
                //   A：判断票数大于0，就卖票，并告知是哪个窗口卖的
                if (ticketCount > 0) {
                    //  B：票数要减1
                    ticketCount--;
                    System.out.println(Thread.currentThread().getName() + "卖出了一张票,还剩余" + ticketCount);

                } else {
                    // ticketCount <= 0
                    break;
                }
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}