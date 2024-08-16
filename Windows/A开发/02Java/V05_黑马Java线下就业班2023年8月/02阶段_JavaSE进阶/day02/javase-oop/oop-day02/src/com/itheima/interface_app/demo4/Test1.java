package com.itheima.interface_app.demo4;

public class Test1 {
    public static void main(String[] args) {
        //创建实现类对象
        Jdk8InterfaceImpl jdk8Interface = new Jdk8InterfaceImpl();

        //调用：默认方法
        String result = jdk8Interface.sayHello("黑马");
        System.out.println(result);
    }
}
