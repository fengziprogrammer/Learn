package com.atguigu.c_singleton;

public class Demo01Singleton {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Singleton singleton = Singleton.getSingleton();
            System.out.println("singleton = " + singleton);
        }
    }
}
