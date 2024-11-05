package com.itheima.ticket_demo;

/*
    1 定义一个类Ticket实现Runnable接口，里面定义一个成员变量：private int ticketCount = 100;
    2 在Ticket类中重写run()方法实现卖票，代码步骤如下
        A：判断票数大于0，就卖票，并告知是哪个窗口卖的
        B：票数要减1
        C：卖光之后，线程停止
    3 定义一个测试类TicketDemo，里面有main方法，代码步骤如下
        A：创建Ticket类的对象
        B：创建三个Thread类的对象，把Ticket对象作为构造方法的参数，并给出对应的窗口名称
        C：启动线程
 */
public class TicketDemo {
    public static void main(String[] args) {
        // 3 定义一个测试类TicketDemo，里面有main方法，代码步骤如下
        // A：创建Ticket类的对象
        Ticket ticket = new Ticket();
        //  B：创建三个Thread类的对象，把Ticket对象作为构造方法的参数，并给出对应的窗口名称
        Thread t1 = new Thread(ticket, "窗口1");
        Thread t2 = new Thread(ticket, "窗口2");
        Thread t3 = new Thread(ticket, "窗口3");

        //  C：启动线程
        t1.start();
        t2.start();
        t3.start();

    }
}
