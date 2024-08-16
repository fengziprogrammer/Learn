package com.itheima.interface_app.demo4;

public class Test2 {
    public static void main(String[] args) {
        //直接调用接口中的静态方法
        String hello = Jdk8Interface.hello("你好!");

        System.out.println(hello);
    }
}
