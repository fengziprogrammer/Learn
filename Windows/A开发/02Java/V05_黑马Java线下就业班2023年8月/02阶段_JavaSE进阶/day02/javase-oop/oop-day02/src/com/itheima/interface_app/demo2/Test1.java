package com.itheima.interface_app.demo2;

public class Test1 {
    public static void main(String[] args) {
        MyInterfaceImpl mi = new MyInterfaceImpl();

        mi.show();

        int data = mi.getData();
        System.out.println(data);
    }
}
