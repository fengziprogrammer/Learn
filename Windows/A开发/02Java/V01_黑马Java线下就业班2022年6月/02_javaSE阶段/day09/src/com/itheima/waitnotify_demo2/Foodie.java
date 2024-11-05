package com.itheima.waitnotify_demo2;

/*
    消费者步骤：
        1，判断桌子上是否有汉堡包。
        2，如果没有就等待。
        3，如果有就开吃
        4，吃完之后，桌子上的汉堡包就没有了
            叫醒等待的生产者继续生产
            汉堡包的总数量减一

        消费者 : 吃货
 */
public class Foodie implements Runnable {
    @Override
    public void run() {
        while (true) {
            synchronized (Desk.OBJ) {
                if (Desk.count == 0) {
                    break;
                } else {
                    // 还没有吃够10个
                    if (Desk.flag) {
                        // 有食物 , 开吃
                        System.out.println("消费者吃掉了有个汉堡包...");
                        Desk.flag = false;
                        Desk.count--;
                        Desk.OBJ.notifyAll();
                    } else {
                        // 没有食物 , 等待
                        try {
                            Desk.OBJ.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
