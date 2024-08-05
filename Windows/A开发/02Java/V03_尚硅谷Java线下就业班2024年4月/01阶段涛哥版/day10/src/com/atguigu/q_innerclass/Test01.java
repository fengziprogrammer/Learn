package com.atguigu.q_innerclass;

public class Test01 {
    public static void main(String[] args) {
        //new实现类对象,调用方法,传递实现类对象,现在实现类对象可以用匿名内部类表示
        method(new USB() {
            @Override
            public void open() {
                System.out.println("USB开启");
            }
        });

        System.out.println("=======================");
    }
    public static void method(USB usb){
        usb.open();
    }
}
