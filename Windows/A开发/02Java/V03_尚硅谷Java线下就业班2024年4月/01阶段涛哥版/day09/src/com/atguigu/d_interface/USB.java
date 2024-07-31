package com.atguigu.d_interface;

public interface USB {
    public abstract void open();
    void close();

    public default void sleep(){
        System.out.println("USB休眠");
    }
}
