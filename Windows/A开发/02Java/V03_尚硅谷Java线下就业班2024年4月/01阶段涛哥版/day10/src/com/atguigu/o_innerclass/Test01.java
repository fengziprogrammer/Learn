package com.atguigu.o_innerclass;

public class Test01 {
    public static void main(String[] args) {
        USB usb = method();
        usb.open();
    }
    public static USB method(){
        //有名字的局部内部类
        class Mouse implements USB{
            @Override
            public void open() {
                System.out.println("鼠标开启");
            }
        }
        Mouse mouse = new Mouse();
        return mouse;
    }
}
