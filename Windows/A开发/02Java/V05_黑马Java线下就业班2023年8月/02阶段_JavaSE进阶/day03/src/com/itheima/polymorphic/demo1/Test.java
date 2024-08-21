package com.itheima.polymorphic.demo1;

public class Test {
    public static void main(String[] args) {
       //多态的代码体现：   父类型  对象  = 子类对象
        Animal an = new Cat();
        an.eat();//方法在执行时，调用的是子类对象重写后的方法
    }
}
