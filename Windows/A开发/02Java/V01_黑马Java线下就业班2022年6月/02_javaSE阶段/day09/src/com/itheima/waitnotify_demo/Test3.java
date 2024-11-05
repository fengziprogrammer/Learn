package com.itheima.waitnotify_demo;
/*
    3 线程进入计时等待并唤醒
        注意：
            1 进入计时等待的线程，时间结束前可以被其他线程唤醒。时间结束后会自动唤醒
            2 sleep方法只有时间到了 , 自动苏醒

    void wait(long timeout) : 让线程进入计时等待 , timeout代表long类型毫秒值
 */
public class Test3 {
    public static void main(String[] args) {
        Object obj = new Object();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程开始执行");
                synchronized (obj) {
                    try {
                        System.out.println("线程进入无线等待状态...");
                        // 此方法如果在3秒钟之内是可以被唤醒
                        obj.wait(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("线程执行完毕...");
            }
        }).start();
    }
}
