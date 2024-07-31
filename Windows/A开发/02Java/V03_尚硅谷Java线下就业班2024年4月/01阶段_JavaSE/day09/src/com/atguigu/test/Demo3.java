package com.atguigu.test;

public class Demo3 {

    /*
        向上转型与向下转型
         向上转型 小 -> 大  自动
         向下转型  大 -> 小  强转
     */
    public static void main(String[] args) {

        // 父类引用指向子类对象
        Person p = new SuperMan();// 向上转型
        System.out.println(p.name);
        System.out.println(p.age);

        p.eat();
       // p.fly();// 普通人-> 超人  取值范围大 ->  取值范围小  强制类型转换
        // 目标数据类型 变量名 = (目标数据类型)需要转换的值;
        SuperMan sm = (SuperMan) p;
        sm.fly();
        sm.dg();
    }
}

class Person{

    String name = "李小林";
    int age = 18;

    public void  eat(){
        System.out.println("人类一般一天吃三顿");
    }
}

class SuperMan extends Person{
    String name = "猪猪侠";
    int age = 180000;

    public void eat(){
        System.out.println("超人不吃饭");
    }

    public void fly(){
        System.out.println("超人飞出去救人");
    }

    public  void dg(){
        System.out.println("猪猪侠光辉事迹有,打倒了唐沂怪,打倒了蒲涛怪,打倒了大大怪");
    }
}
