package com.itheima.homework.test8;

/*
    请使用“匿名Runnable”子类的方式实现线程，线程中计算1--500所有数字的累加和，并打印计算结
 */
public class Test8 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            int sum = 0;
            @Override
            public void run() {
                for (int i = 1; i <= 500; i++) {
                    sum += i;
                }
                System.out.println(sum);
            }
        }).start();
    }
}
