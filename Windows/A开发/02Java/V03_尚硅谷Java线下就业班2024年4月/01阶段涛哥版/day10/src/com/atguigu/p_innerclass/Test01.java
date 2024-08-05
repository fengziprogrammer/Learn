package com.atguigu.p_innerclass;

public class Test01 {
    public static void main(String[] args) {
        new USB() {
            @Override
            public void open() {
                System.out.println("鼠标开启");
            }
        }.open();

        System.out.println("========================");

        USB usb = new USB() {
            @Override
            public void open() {
                System.out.println("鼠标开启");
            }
        };
        usb.open();

    }
}
