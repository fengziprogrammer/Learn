package com.atguigu.g_singleton;

public class Singleton1 {
    /**
     * 防止外界随便使用构造方法new对象,我们需要将构造方法私有化
     */
    private Singleton1() {

    }

    /*
       懒汉式,不着急new对象
     */
    private static Singleton1 singleton = null;

    /**
     * 为了将内部new出来的对象给外界
     * 定义一个方法,将内部new出来的对象返回
     */
    public static Singleton1 getSingleton() {
        //如果singleton不是null就没必要抢锁,直接返回
        if (singleton==null){
            synchronized (Singleton1.class){
                if (singleton == null) {
                    singleton = new Singleton1();
                }
            }
        }
        return singleton;
    }
}
