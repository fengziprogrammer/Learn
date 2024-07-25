package com.atguigu.test;

import com.atguigu.bean.Father;
import com.atguigu.bean.Son;

public class Test {

    public static void main(String[] args) {
        Son son = new Son();

        // son.method1(); 没有继承
        // son.method2();  // 只能在本包中被访问
        // son.method3();// 可以跨包,前提是子父类
        son.method4();
    }

}

class Son2 extends Father {//与Father是跨包
    public void show(){
        method3();// 可以访问   protected 跨包访问时,仅于子类中可见
    }
}
