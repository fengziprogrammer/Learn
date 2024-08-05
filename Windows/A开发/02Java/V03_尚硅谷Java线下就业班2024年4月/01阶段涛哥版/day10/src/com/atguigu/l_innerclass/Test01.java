package com.atguigu.l_innerclass;

public class Test01 {
    public static void main(String[] args) {
        //调用method01传递参数,传递实参时,
        Mouse mouse = new Mouse();
        method01(mouse);
        System.out.println("=================");
        USB usb = method02();
        usb.open();//Mouse重写的方法
    }

    /**
     * 形参为接口类型
     * @param usb
     */
    public static void method01(USB usb){//形参为接口类型 USB usb = mouse
        usb.open();
    }

    /**
     * 方法返回值类型为接口类型
     */
    public static USB method02(){
        Mouse mouse = new Mouse();
        return mouse;
    }
}
