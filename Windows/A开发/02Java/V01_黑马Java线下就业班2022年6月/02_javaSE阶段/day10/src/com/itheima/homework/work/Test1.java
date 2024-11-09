package com.itheima.homework.work;

/*
    1 请使用Lambda表达式启动一个Thread线程，线程中打印：1--100所有数字。
 */
public class Test1 {
    public static void main(String[] args) {
        // new Thread(需要一个Runnable实现类对象).start();
        new Thread(() -> {
            for (int i = 1; i <= 100; i++) {
                System.out.println(i );
            }
        }).start();
    }
}
