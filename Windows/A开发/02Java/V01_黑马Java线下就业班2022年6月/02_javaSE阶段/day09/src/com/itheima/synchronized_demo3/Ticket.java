package com.itheima.synchronized_demo3;

import java.util.concurrent.locks.ReentrantLock;

/*
    虽然我们可以理解同步代码块和同步方法的锁对象问题，但是我们并没有直接看到在哪里加上了锁，在哪里释放了锁，
    为了更清晰的表达如何加锁和释放锁，JDK5以后提供了一个新的锁对象Lock

    Lock中提供了获得锁和释放锁的方法
        void lock()：获得锁
        void unlock()：释放锁

    Lock是接口不能直接实例化，这里采用它的实现类ReentrantLock来实例化
        ReentrantLock的构造方法
        ReentrantLock()：创建一个ReentrantLock的实例

    注意：多个线程使用相同的Lock锁对象，需要多线程操作数据的代码放在lock()和unLock()方法之间。一定要确保unlock最后能够调用

 */
public class Ticket implements Runnable {
    // 存在一百张电影票
    private int ticketCount = 100;// 0
    // 创建的是Lock的实现类对象
    private static final ReentrantLock LOCK = new ReentrantLock();

    @Override
    public void run() {
        // 循环卖票
        while (true) {
            try {
                LOCK.lock();// 获得锁
                if (ticketCount <= 0) {
                    // 票卖光了
                    break;
                } else {
                    // 还有票可卖
                    ticketCount--;
                    System.out.println(Thread.currentThread().getName() + "卖出了一张票,还剩" + ticketCount + "张");
                }
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                LOCK.unlock();// 释放锁
            }
        }
    }
}
