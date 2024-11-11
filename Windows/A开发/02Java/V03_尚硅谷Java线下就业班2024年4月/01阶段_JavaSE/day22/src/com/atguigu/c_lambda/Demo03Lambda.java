package com.atguigu.c_lambda;

public class Demo03Lambda {
    public static void main(String[] args) {
       method(new MyUsb() {
           @Override
           public void open(String s) {
               System.out.println(s+"打开了");
           }
       });

        System.out.println("====================");

        method(s-> System.out.println(s+"打开了"));
    }

    public static void method(MyUsb myUsb) {

        myUsb.open("鼠标");
    }
}
