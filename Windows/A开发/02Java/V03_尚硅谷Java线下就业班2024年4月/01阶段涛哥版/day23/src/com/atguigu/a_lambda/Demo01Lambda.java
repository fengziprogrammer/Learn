package com.atguigu.a_lambda;

public class Demo01Lambda {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("我执行了");
            }
        }).start();

        System.out.println("===================");

        new Thread(()-> System.out.println("我要执行了")).start();
    }
}
