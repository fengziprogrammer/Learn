package com.itheima.stream_demo;

public class Test {
    public static void main(String[] args) {
        Test t = new Test();
        t.method2().method1().method4();
    }

    public Test method1() {
        return new Test();
    }

    public Test method2() {
        return new Test();
    }

    public Test method3() {
        return new Test();
    }

    public void method4() {

    }

}
