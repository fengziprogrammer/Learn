package com.itheima.exds.trait.multilayer;

public class Test1 {
    public static void main(String[] args) {
        //创建子类对象
        Son son = new Son();

        //调用父类中的成员方法
        son.drinking();

        //调用爷爷类中的成员方法
        son.smoking();
    }
}
