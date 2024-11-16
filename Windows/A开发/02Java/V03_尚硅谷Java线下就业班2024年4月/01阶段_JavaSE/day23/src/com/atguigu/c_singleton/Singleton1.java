package com.atguigu.c_singleton;

public class Singleton1 {
    /**
     * 为了不让外界随意使用构造方法new对象,
     * 所以将构造私有化
     */
    private Singleton1() {

    }

    /*
      因为是懒汉式,不着急new对象
     */
    private static Singleton1 singleton = null;

    /**
     * 提供一个方法,返回此类内部的对象,给外界使用
     */
    public static Singleton1 getSingleton() {
        if (singleton==null){//考虑的是抢不抢锁
            synchronized (Singleton1.class){
                if (singleton == null) {
                    singleton = new Singleton1();
                }
            }
        }
        return singleton;
    }
}
