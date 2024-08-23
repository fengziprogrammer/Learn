package com.itheima.final_demo;

/*
    final : 中文最终的意思  , 是Java中的一个关键字
    final能修饰什么?
        final可以修饰类  : 是一个最终的类(太监类) , 没有子类
        final可以修饰变量 : final修饰的变量是一个常量(自定义常量) , 只能赋值一次
            注意 : 自定义常量命名规范 : 每个字母都需要大写, 多个单词之间用下划线分割
            举例 : NUMBER   MAX_VALUE
        final可以修饰方法 : 是一个最终的方法 , 不能被重写 , 注意 : 私有的方法子类也是无法重写!

 */
public class FinalDemo {
    public static void main(String[] args) {
//        final int number = 10;
//        number = 100;
    }
}

class Person {
    public final void show() {
        System.out.println("父类的show方法");
    }
}

class Student extends Person {
    // 方式1 : 如果final修饰的是成员变量 , 那么可以直接赋值
    //    final int num = 10;
    final int num;

    // 方式2 : 如果final修饰的是成员变量 , 我们可以在所有的构造方法中进行赋值
    public Student() {
        num = 10;
    }

    public Student(int a) {
        num = 10;
    }

//    @Override
//    public void show() {
//        super.show();
//    }
}

//class Student extends Person{
//
//}
