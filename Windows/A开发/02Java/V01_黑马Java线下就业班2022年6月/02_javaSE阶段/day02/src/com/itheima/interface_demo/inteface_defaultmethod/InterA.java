package com.itheima.interface_demo.inteface_defaultmethod;

public interface InterA {
    public abstract void show1();

    public abstract void show2();

    // 默认方法
    public default void defaultMethod() {
        System.out.println("接口A中默认方法");
    }
}

interface InterB {
    // 默认方法
    public default void defaultMethod() {
        System.out.println("接口B中默认方法");
    }
}

class InterImpl extends Object implements InterA, InterB {

    @Override
    public void show1() {
    }

    @Override
    public void show2() {
    }

    @Override
    public void defaultMethod() {
        System.out.println("实现类重写接口中的默认方法...");
    }
}
