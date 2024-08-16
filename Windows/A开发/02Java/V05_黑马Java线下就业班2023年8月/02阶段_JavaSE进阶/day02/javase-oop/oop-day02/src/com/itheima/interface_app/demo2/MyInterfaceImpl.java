package com.itheima.interface_app.demo2;

//接口实现类： 实现多个接口
public class MyInterfaceImpl  implements MyInterfaceA , MyInterfaceB{
    //重写所实现接口中所有的抽象方法
    @Override
    public void show() {
        System.out.println("show方法");
    }

    @Override
    public int getData() {
        return 10000;
    }
}
