package com.atguigu.g_interface;

public interface InterfaceB {
    public abstract void methodAbs();

    public default void methodDef(){
        System.out.println("我是接口B中的methodDef方法");
    }
}
