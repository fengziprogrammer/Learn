package com.itheima.permissions_demo2;

import com.itheima.permissions_demo1.Father;

// 在不同包 , 无关类
public class Test {
    public void show(){
        Father father = new Father();
        father.method1();
//        father.method2();
//        father.method3();
//        father.method4();
    }
}
