package com.itheima.synchronized_demo2;

/*
    同步方法：就是把synchronized关键字加到方法上

    格式：修饰符 synchronized 返回值类型 方法名(方法参数) {    }

    同步代码块和同步方法的区别:
        1 同步代码块可以锁住指定代码,同步方法是锁住方法中所有代码
        2 同步代码块可以指定锁对象,同步方法不能指定锁对象

    注意 : 同步方法时不能指定锁对象的 , 但是有默认存在的锁对象的。
        1 对于非static方法,同步锁就是this。
        2 对于static方法,我们使用当前方法所在类的字节码对象(类名.class)。   Class类型的对象

 */
public class Ticket implements Runnable {
    private static int ticketCount = 100;

    @Override
    public void run() {
        while (true) {
            // t1 t2 t3
            if (method()) {
                break;
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // 此方法是静态方法 , 所以锁对象为 当前类的字节码对象 Ticket.class ,  注意 : 一个类的字节码对象是唯一的
    private static synchronized boolean method() {
        //   A：判断票数大于0，就卖票，并告知是哪个窗口卖的
        if (ticketCount > 0) {
            //  B：票数要减1
            ticketCount--;
            System.out.println(Thread.currentThread().getName() + "卖出了一张票,还剩余" + ticketCount);
            return false;
        } else {
            // ticketCount <= 0
            return true;
        }
    }

//    // 此方法是非静态方法 , 所以锁对象为this
//    private synchronized boolean method() {
//        // t1  this = ticket1
//        // t2  this = ticket2
//        // t3  this = ticket3
//        // System.out.println(this);
//        //   A：判断票数大于0，就卖票，并告知是哪个窗口卖的
//        if (ticketCount > 0) {
//            //  B：票数要减1
//            ticketCount--;
//            System.out.println(Thread.currentThread().getName() + "卖出了一张票,还剩余" + ticketCount);
//            return false;
//        } else {
//            // ticketCount <= 0
//            return true;
//        }
//    }
}
