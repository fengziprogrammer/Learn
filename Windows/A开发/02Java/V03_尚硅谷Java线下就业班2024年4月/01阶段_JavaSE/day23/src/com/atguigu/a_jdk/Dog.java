package com.atguigu.a_jdk;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃💩");
    }

    //特有方法
    public void lookDoor(){
        System.out.println("看门");
    }
}
