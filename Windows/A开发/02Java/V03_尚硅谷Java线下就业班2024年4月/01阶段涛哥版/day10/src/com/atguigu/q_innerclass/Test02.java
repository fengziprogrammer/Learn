package com.atguigu.q_innerclass;

public class Test02 {
    public static void main(String[] args) {
        USB usb = method();
        usb.open();
    }
    public static USB method(){
        return new USB() {
            @Override
            public void open() {
                System.out.println("USB打开了");
            }
        };
    }
}
