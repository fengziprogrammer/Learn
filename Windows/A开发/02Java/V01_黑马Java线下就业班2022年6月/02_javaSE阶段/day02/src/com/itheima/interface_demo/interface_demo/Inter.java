package com.itheima.interface_demo.interface_demo;

public interface Inter {
    public abstract void show1();
    public abstract void show2();
    public abstract void show3();
}

interface InterB{
    // 成员变量 : 只能是常量, 而且有默认修饰符 public static final
    public static final int num1 = 10;
    public static final int NUM2 = 20;

    // 构造方法 : 没有
    // public InterB(){}

    /*
        成员方法
            JDK8之前 : 只能定义抽象方法 , 默认修饰符 public abstract
            JDK8版本 : 增加了 默认方法 和 静态方法
            JDK9版本 : 增加了 私有方法
     */
    public abstract void show1();
}

// 子类(实现类)
class InterImpl extends Object implements Inter , InterB{
    @Override
    public void show1() {
    }

    @Override
    public void show2() {
    }

    @Override
    public void show3() {
    }
}