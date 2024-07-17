package com.atguigu.d_object;

public class Test01 {
    public static void main(String[] args) {
        //创建对象
        Person p1 = new Person();
        System.out.println(p1.name);
        System.out.println(p1.age);
        //为属性赋值
        p1.name = "柳岩";
        p1.age = 36;
        System.out.println(p1.name);
        System.out.println(p1.age);
        System.out.println("==================");

        p1.eat();
        p1.drink();
        p1.sleep();
        p1.la();
        p1.pee();

    }
}
