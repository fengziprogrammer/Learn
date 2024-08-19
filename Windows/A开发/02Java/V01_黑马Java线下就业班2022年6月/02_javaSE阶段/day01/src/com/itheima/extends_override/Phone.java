package com.itheima.extends_override;

public class Phone {
    public void call() {
        System.out.println("打电话...");
    }

    public Object sendMessage() {
        System.out.println("发短信...");
        return new Object();
    }
}
