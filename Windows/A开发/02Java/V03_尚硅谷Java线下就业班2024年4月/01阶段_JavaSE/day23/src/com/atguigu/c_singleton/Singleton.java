package com.atguigu.c_singleton;

public class Singleton {
    /**
     * 为了不让外界随意使用构造方法new对象,
     * 所以将构造私有化
     */
    private Singleton(){

    }
    /*
      因为饿汉式,迫不及待想要new对象出来
      所以我们new对象的时候将其变成静态的,随着类的加载而创建

      而且new出来的对象,不能让外界随意直接调用,所以将其变成私有的
     */
    private static Singleton singleton = new Singleton();

    /**
     * 提供一个方法,返回此类内部的对象,给外界使用
     */
    public static Singleton getSingleton(){
        return singleton;
    }
}
