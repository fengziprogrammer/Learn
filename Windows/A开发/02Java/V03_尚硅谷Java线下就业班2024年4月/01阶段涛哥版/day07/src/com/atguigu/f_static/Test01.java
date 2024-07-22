package com.atguigu.f_static;

public class Test01 {
    public static void main(String[] args) {
        Test01 test01 = new Test01();
        test01.method01();
        System.out.println("==================");
        Person person = new Person();
        person.eat();

        System.out.println("===============");
        method03();
        Test01.method03();

        System.out.println("=================");

        Person.drink();
        new Person().drink();
    }

    public void method01(){
        System.out.println("我是非静态方法method01");
        method02();  //直接调用
        Test01.method02();//类名直接调用
        new Test01().method02();

        System.out.println("===================");
        Person.drink();
        Person person = new Person();
        person.drink();
    }

    public static void method02(){
        System.out.println("我是静态方法method02");
    }

    public static void method03(){
        System.out.println("我是静态方法method03");
    }

    public void method04(){
        method01();
        new Test01().method01();

        System.out.println("=============");

        new Person().eat();
    }
}
