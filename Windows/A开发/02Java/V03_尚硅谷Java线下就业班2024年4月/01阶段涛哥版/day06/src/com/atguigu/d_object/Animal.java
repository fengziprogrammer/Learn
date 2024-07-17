package com.atguigu.d_object;

public class Animal {
    String name;
    String color;

    public void eat(String kind,String food){
        System.out.println(kind+"吃"+food);
    }
    public void jiao(String kind){
        System.out.println(kind+"在叫");
    }
}
