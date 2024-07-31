package com.atguigu.g_interface;

public class InterfaceImpl implements InterfaceB,InterfaceC{
    @Override
    public void methodAbs() {
        System.out.println("我是重写的methodAbs");
    }

    @Override
    public void methodDef() {
        System.out.println("我是重写的默认方法");
    }

}
