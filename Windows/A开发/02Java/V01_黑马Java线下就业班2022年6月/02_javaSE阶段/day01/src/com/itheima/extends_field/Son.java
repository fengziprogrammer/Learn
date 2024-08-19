package com.itheima.extends_field;

// public - protected - 默认的 - private
/*
    继承中成员变量访问特点 : 就近原则
    就近原则 : 局部有用局部变量 , 局部没有用本类成员变量 , 本类没有用父类非私有的成员变量

    this  : 当前类的对象引用
    super : 父类数据存储的空间(看做成父类的对象)
 */
public class Son extends Father {
     int age = 10;

    public void show() {
         int age = 1;
        System.out.println(age);// 1
        System.out.println(this.age);// 10
        System.out.println(super.age);// 30
        System.out.println(super.grandFatherAge);// 50

        System.out.println(num);
    }
}

class Father extends GrandFather {
    int num = 10;
    int age = 30;
    int grandFatherAge = super.age;
}

class GrandFather {
    int age = 50;
}

class Test {
    public static void main(String[] args) {
        Son s = new Son();

        s.show();
    }
}
