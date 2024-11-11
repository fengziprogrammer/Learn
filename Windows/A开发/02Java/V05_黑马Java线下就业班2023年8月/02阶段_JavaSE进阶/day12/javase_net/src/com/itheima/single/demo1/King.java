package com.itheima.single.demo1;

//保证：当前类仅有一个对象
public class King {
    //静态成员变量： 共享数据 （在内存中独有一份）
    //创建本类的对象（唯一对象）
    private static King king = new King();//静态的内容是随着类的加载而存在

    //私有构造方法
    private King(){

    }

    //静态方法：返回当前类对象的实例
    public static King getInstance(){
        return king;
    }
}
