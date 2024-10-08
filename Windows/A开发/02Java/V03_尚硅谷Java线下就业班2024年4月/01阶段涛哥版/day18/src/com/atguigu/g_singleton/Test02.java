package com.atguigu.g_singleton;

public class Test02 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Singleton1 singleton = Singleton1.getSingleton();
            System.out.println("singleton = " + singleton);
        }
    }
}
