package com.atguigu.e_object;

public class Test01 {
    public static void main(String[] args) {
        //原始方式创建对象
        Person p1 = new Person();
        p1.name = "柳岩";
        System.out.println(p1.name);
        p1.eat();

        System.out.println("=================");

        //匿名对象的方式创建对象
        new Person().eat();

        //匿名对象方式为属性赋值
        new Person().name = "金莲";
        System.out.println(new Person().name);//null
    }
}
