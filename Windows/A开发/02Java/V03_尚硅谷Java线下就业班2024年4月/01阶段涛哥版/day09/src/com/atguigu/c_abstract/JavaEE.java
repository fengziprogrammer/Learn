package com.atguigu.c_abstract;

public class JavaEE extends Developer{
    public JavaEE() {
    }

    public JavaEE(int id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("员工号为:"+getId()+"的"+getName()+"员工,正在开发淘宝");
    }
}
