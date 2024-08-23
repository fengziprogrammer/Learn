package com.itheima.interface_demo.inteface_staticmethod;

public interface InterA {
    // 静态方法
    public static void show(){
        System.out.println("接口A中的静态方法");
    }
}

interface InterB {
    // 静态方法
    public static void show(){
        System.out.println("接口B中的静态方法");
    }
}

class InterImpl implements InterA , InterB{

}