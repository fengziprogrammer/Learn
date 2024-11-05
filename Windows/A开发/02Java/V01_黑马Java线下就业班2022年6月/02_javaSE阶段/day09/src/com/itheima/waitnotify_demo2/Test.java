package com.itheima.waitnotify_demo2;
// 测试类
public class Test {
    public static void main(String[] args) {
        new Thread(new Foodie() , "吃货").start();
        new Thread(new Cooker() , "厨师").start();
    }
}
