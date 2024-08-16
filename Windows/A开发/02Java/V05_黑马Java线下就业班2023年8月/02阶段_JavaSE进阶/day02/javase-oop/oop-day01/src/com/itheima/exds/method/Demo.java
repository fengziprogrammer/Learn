package com.itheima.exds.method;

public class Demo {
    public static void main(String[] args) {
        //创建Cat类对象
        Cat cat = new Cat();

        cat.test1();//冲突。 优先访问子类对象中的test1方法
        cat.test2();//不冲突。调用父类对象中的test2方法
        cat.test3();//不冲突。调用子类对象中的test3方法

        cat.show();
    }
}
