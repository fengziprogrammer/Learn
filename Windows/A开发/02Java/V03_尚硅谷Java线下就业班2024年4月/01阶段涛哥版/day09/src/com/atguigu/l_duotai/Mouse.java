package com.atguigu.l_duotai;

public class Mouse implements USB{

    @Override
    public void open() {
        System.out.println("鼠标开启");
    }

    @Override
    public void close() {
        System.out.println("鼠标关闭");
    }
}
