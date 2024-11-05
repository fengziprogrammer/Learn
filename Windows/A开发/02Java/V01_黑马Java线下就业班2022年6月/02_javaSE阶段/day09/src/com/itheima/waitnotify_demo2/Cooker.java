package com.itheima.waitnotify_demo2;

/*
    生产者步骤：
        1，判断桌子上是否有汉堡包
            如果有就等待，如果没有才生产。
        2，把汉堡包放在桌子上。
        3，叫醒等待的消费者开吃

        生产者 : 厨师
 */
public class Cooker implements Runnable {
    @Override
    public void run() {
        while (true) {// 需要生产够10个汉堡包 , 才可以停止
            synchronized (Desk.OBJ) {
                // 厨师
                if (Desk.count == 0) {
                    break;
                } else {
                    // 还没有生产够10个汉堡包
                    if (Desk.flag) {
                        // 桌子上有汉堡包 , 不需要生产
                        try {
                            Desk.OBJ.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        // 桌子上没有汉堡包
                        System.out.println("厨师生产一个汉堡包....");
                        Desk.flag = true;
                        // 唤醒消费者
                        Desk.OBJ.notifyAll();
                    }
                }
            }
        }
    }
}
