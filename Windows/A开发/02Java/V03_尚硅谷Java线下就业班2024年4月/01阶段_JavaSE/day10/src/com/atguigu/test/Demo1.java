package com.atguigu.test;

public class Demo1 {

    /*
        1.定义一个类动物类  属性:姓名,年龄  功能:吃饭,睡觉
        2.定义一个小猫类,属性:姓名,年龄  功能:吃饭-小猫吃鱼,睡觉
        3.定义一个小狗类,属性:姓名,年龄  功能:吃饭-小狗吃肉,睡觉

        抽象
            不具体
            关键字abstract

        抽象类的特点
            1> 抽象类不能实例化
            2> 子类的特点
                普通类
                    子类必须重写父类的所有的抽象方法
                抽象类
                    可以不重写或者部分重写父类的抽象方法
            3> 抽象类的成员特点
                抽象类 = 普通类 + 抽象方法
                成员变量
                    与普通类一致,既可以是变量也可以是常量
                成员方法
                    可以有抽象方法,也可以没有抽象方法
                    抽象方法:要求子类必须实现
                构造器
                    有
            4> 设计原则
                 依然是希望自身作为一个继承体系的父类,子类继承的成员
     */
    public static void main(String[] args) {
        new Cat().eat();
        // new Dog().eat();

        // Animal a = new Animal();

    }
}

abstract class Animal {
    // 属性:姓名,年龄  功能:吃饭,睡觉
    String name;
    int age;

    public Animal() {

    }

    public abstract void eat();// 抽象的方法

    // 父类定义方法,对子类要求:需要子类通过该方法描述自己是什么类,有什么特点
    // 父类的某个功能,自己无法实现,交由子类实现(子类必须实现)
    public abstract void show();

    public void sleep() {
        System.out.println("------动物得睡觉");
    }

}

class Cat extends  Animal{
    // 功能:吃饭-小猫吃鱼

    @Override
    public void eat() {
        System.out.println("小猫吃鱼");
    }

    @Override
    public void show() {
        System.out.println("我是一个小猫类");
    }
}

abstract class Dog extends Animal{
    /*@Override
    public void eat() {
        System.out.println("小狗吃肉");
    }*/
}

