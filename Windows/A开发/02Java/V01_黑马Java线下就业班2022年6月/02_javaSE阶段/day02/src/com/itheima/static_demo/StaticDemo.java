package com.itheima.static_demo;

/*
    static概述    : 中文静态意思 , 是一个关键字也是一个修饰符
        被static修饰的成员叫做静态成员

    静态成员特点   :
        1 静态成员可以被所在类的所有对象共享
        2 静态成员可以通过类名进行调用
            静态成员可以通过对象调用,也可以通过类名调用, 推荐使用类名调用
        3 静态成员随着类的加载而加载 , 优先于对象存在

    静态方法的注意事项
        1 非静态方法可以调用任意成员
        2 静态方法只能调用静态成员 !!!
            要想调用非静态成员需要创建对象, 使用对象调用!
        3 静态方法中不能使用this关键字

    现有类再有对象 , 静态成员随着类的加载而加载 , 所以优先于对象存在

    静态方法中只能调用静态成员
    如果要想调用非静态成员 , 那么需要使用对象调用!
 */
public class StaticDemo {
    public static void main(String[] args) {
        Student.school = "传智专修学院";

        Student s1 = new Student();
        s1.name = "李沁";
        s1.age = 18;
        // s1.school = "传智专修学院";
        s1.show();

        System.out.println("==============");

        Student s2 = new Student();
        s2.name = "柳岩";
        s2.age = 20;
        s2.show();


//        StaticDemo staticDemo = new StaticDemo();
//        System.out.println(staticDemo.getMax(10, 20));

        System.out.println(StaticDemo.getMax(10, 20));
        System.out.println(getMax(10, 20));
        // 静态方法中只能调用静态成员
        // 如果要想调用非静态成员 , 那么需要使用对象调用!
    }

    public static int getMax(int a, int b) {
        return a > b ? a : b;
    }
}















