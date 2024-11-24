package com.itheima.singledesign;
/*
    需求 : 使用单例模式(饿汉式) , 要求此类只能有一个对象

    步骤 :
        1. 将构造方法私有化，使其不能在类的外部通过new关键字实例化该类对象。
        2. 在该类内部产生一个唯一的实例化对象，并且将其封装为private static 类型的成员变量。
        3. 定义一个静态方法返回这个唯一对象。
 */
public class King {
    // 1. 将构造方法私有化，使其不能在类的外部通过new关键字实例化该类对象。
    private King(){

    }

    // 2. 在该类内部产生一个唯一的实例化对象，并且将其封装为private static 类型的成员变量。
    private static final King KING = new King();

    // 3. 定义一个静态方法返回这个唯一对象。
    public static King getInstance(){
        return KING;
    }
}

