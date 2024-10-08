package com.atguigu.g_singleton;

public class Singleton {
    /**
     * 防止外界随便使用构造方法new对象,我们需要将构造方法私有化
     */
    private Singleton(){

    }

    /*
       为了赶紧new对象,我们new对象的时候变成静态的
       为了不让外界随便调用对象,我们将其变成private
     */
    private static Singleton singleton = new Singleton();

    /**
     * 为了将内部new出来的对象给外界
     * 定义一个方法,将内部new出来的对象返回
     */
    public static Singleton getSingleton(){
        return singleton;
    }
}
