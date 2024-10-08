package com.atguigu.d_thread;

public class Test01 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程1");
            }
        }).start();
    }
}
