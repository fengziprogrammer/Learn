package com.atguigu.e_interface;

public class Mouse implements USB{
    @Override
    public void methodDef(){

        System.out.println("我是重写的接口中的默认方法");
    }
}
