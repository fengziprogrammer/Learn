package com.itheima.interface_app.demo4;

public interface Jdk8Interface {
    //常量
    public static final int COUNT = 10;//常量通常使用大写作为命名

    //抽象方法
    public abstract void method();

    //默认方法：必须有default关键字 （仅现在书写在接口中）
    public default String sayHello(String name) {
        return "你好," + name;
    }


    //静态方法（可以直接使用：接口名.静态方法）
    public static String hello(String msg) {
        return msg + "黑马";
    }

}
