package com.atguigu.g_interface;

public interface InterfaceC {
    public abstract void methodAbs();

    public default void methodDef(){
        System.out.println("我是接口C中的methodDef方法");
    }
}
