package com.itheima.waitnotify_demo2;

public class Demo {
    static boolean flag = true; // false

    public static void main(String[] args) {
        Object obj = new Object();
        // 传智播客
        // 黑马程序员
        // 传智播客
        // 黑马程序员
        // ...

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (obj) {
                        if (flag) {
                            System.out.print("传");
                            System.out.print("智");
                            System.out.print("播");
                            System.out.println("客");
                            flag = false;
                            obj.notifyAll();
                        } else {
                            try {
                                obj.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (obj) {
                        if (flag) {
                            try {
                                obj.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        } else {
                            System.out.print("黑");
                            System.out.print("马");
                            System.out.print("程");
                            System.out.print("序");
                            System.out.println("员");
                            flag = true;
                            obj.notifyAll();
                        }
                    }
                }
            }
        }).start();
    }
}
