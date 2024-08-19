package com.itheima.extends_demo;

public class Son extends Father {

}

class Father extends GrandFather {
    public void method2() {
    }
}

class GrandFather {
    public void method1() {
    }
}

// 不支持多继承
//class A extends B extends C{
//
//}
//class B{
//
//}
//class C{
//
//}
