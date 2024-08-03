package com.atguigu.demo;

public class Dumb extends Person implements Hear{
    @Override
    public void eat() {
        System.out.println("---Dumb---eat");
    }

    @Override
    public void hear() {
        System.out.println("可以听");
    }

    @Override
    public void show() {
        System.out.println("我是一个哑巴类,我可以吃也可以听");
        // System.out.println(this.getName() + "..." + this.getAge());
        System.out.println(this.toString());
    }
}
