package com.atguigu.constructor;

/*
6.4.1 类的第三个成员：构造器


1、构造器的作用是什么？
（1）new对象，即new关键字后面出现的一定是构造器，也只能是构造器
（2）在new对象的同时，给对象的“实例变量”初始化，即赋值

2、什么是构造器？
【修饰符】 class 类名{
    【修饰符】 类名(){ //构造器
    }
    【修饰符】 类名(形参列表){ //构造器
    }

    【修饰符】 返回值类型 方法名(){ //成员方法
    }
    【修饰符】 返回值类型 方法名(形参列表){//成员方法
    }
}

（1）长的像方法，所以又称为构造方法。
（2）和方法有不同的地方
A：构造器的名称不能随意乱写，只能也一定要和类名完全一致，包括大小写
B：构造器没有返回值类型
C：构造器的修饰符只能是权限修饰符，可以有四种权限修饰符的情况，private,缺省，protected，public

3、构造器的特点
（1）如果一个类没有手动编写任意构造器，那么编译器将会自动添加一个默认的无参构造。
而且此时构造器的权限修饰符默认和class类前面的权限修饰符一致。

（2）如果你手动编写了任意一种构造器，那么编译器就不会再自动添加默认的无参构造。
如果此时需要无参构造，那么必须手动编写，不能靠编译器自动生成了。

（3）构造器可以重载
 */
public class TestConstructor {
    public static void main(String[] args) {
//        Student s1 = new Student();//调用默认的无参构造
            /*
            如果Student类中声明了其他构造器，那么编译器就不会再自动添加默认的无参构造。
            Student类就没有无参构造，那么上面的代码就报错了。
             */
        Student s2 = new Student("张三");
        System.out.println("学生s2的姓名：" + s2.getName());

        s2.setName("张三丰");//在原有对象的基础上，修改了学生姓名
        System.out.println("学生s2的姓名：" + s2.getName());

        s2 = new Student("张三娇");//这是由new了一个新对象
        System.out.println("学生s2的姓名：" + s2.getName());
    }
}
