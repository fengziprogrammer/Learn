package com.itheima.interface_app.demo1;

//接口实现类 ：  实现一个接口
public class MyInterfaceImpl implements MyInterface{
    @Override
    public String sayHello(String name) {
        return "你好,"+name;
    }
}
