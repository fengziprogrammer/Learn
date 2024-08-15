package com.atguigu.a_object;

public class Student {
    @Override
    public void finalize() throws Throwable {
        System.out.println(this+"..student对象被回收了........");
    }
}
