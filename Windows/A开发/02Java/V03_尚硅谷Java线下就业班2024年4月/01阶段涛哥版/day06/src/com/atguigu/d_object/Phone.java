package com.atguigu.d_object;

public class Phone {
    //属性
    String brand;
    String color;
    int price;

    //行为
    public void call(String name){

        System.out.println("给"+name+"打电话");
    }

    public String message(String name){

        return "给"+name+"发短信";
    }
}
