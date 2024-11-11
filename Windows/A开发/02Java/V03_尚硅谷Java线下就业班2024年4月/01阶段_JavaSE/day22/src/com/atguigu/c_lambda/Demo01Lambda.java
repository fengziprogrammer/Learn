package com.atguigu.c_lambda;

public class Demo01Lambda {
    public static void main(String[] args) {

        // Thread(Runnable r)
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程1");
            }
        }).start();

        System.out.println("========================");
        new Thread(()-> System.out.println("线程1")).start();
    }
}
