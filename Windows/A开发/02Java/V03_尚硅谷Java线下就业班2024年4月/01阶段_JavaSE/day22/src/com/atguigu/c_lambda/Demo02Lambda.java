package com.atguigu.c_lambda;

public class Demo02Lambda {
    public static void main(String[] args) {
        method(new USB() {
            @Override
            public void open() {
                System.out.println("鼠标打开");
            }
        });

        System.out.println("=========Lambda===========");

        method(()-> System.out.println("鼠标打开"));
    }

    public static void method(USB usb) {
        usb.open();
    }
}
