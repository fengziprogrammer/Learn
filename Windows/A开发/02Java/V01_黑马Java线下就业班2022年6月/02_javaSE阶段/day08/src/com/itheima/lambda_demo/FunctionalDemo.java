package com.itheima.lambda_demo;

/*
    函数式接口 : 只有一个抽象方法需要重写的接口，函数式接口 !!!

    接口中有且只有一个抽象方法的接口 , 就是函数式接口 : 错误!!
 */
public class FunctionalDemo {

}

// 函数式接口
@FunctionalInterface
interface Sport {
    public abstract void run();
}

class SportImpl implements Sport {
    @Override
    public void run() {

    }
}

@FunctionalInterface
interface Inter{
    public abstract void show();
    // 如果Object类中的方法作为抽象方法, 子类可以不重写
    public abstract String toString();

    public default void show2(){
    }
}
class InterImpl implements Inter{
    @Override
    public void show() {
    }
}