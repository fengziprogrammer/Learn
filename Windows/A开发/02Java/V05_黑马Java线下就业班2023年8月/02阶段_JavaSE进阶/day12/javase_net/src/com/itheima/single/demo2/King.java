package com.itheima.single.demo2;

public class King {
    //创建本类的对象（唯一对象）
    private static King king;//默认值：null

    //私有构造方法
    private King(){

    }

    //静态方法：返回当前类对象的实例（保证：在多线程情况下，对象也是唯一的）
    public synchronized static King getInstance(){
        //判断：对象是否为空
        if(king == null){
           king = new King();
        }
        return king;
    }
}
