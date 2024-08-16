package com.itheima.abstr.example;

public abstract class Animal {
    //吃（抽象方法）
    public abstract void eat();

    //喝水
    public void drink(){
        System.out.println("喝水...");
    }
}
