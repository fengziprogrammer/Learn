package com.atguigu.utils;

public class Demo01ThreadLocal {
    public static void main(String[] args) {
        ThreadLocal<String> tl = new ThreadLocal<>();
        tl.set("涛哥");
        tl.set("曼曼");
        System.out.println(tl.get());

        new Thread(()->{
            System.out.println(tl.get());
        }).start();
    }
}
