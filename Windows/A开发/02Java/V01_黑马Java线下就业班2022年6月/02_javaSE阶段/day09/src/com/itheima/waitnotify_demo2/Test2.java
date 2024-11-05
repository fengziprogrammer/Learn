package com.itheima.waitnotify_demo2;

public class Test2 {
    public static void main(String[] args) {
        int num = 10;
        Object obj = new Object();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (obj) {
                        // System.out.println(num);
                        //num = 20;
                    }
                }
            }
        }).start();

        class Demo2 {
            public void show(){
                // num = 20;
            }
        }
    }

}
