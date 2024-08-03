package com.atguigu.demo;

public class Demo {

    /*
    定义一个父类 Person
            共性属性:姓名,年龄
            共性功能:睡觉
            共性抽象功能: show()  作用是描述自己是什么类,属性值是多少

            存在三个接口
            吃的接口   interface Eat {   吃的功能  }
            听的接口   interface  Hear{   听的功能}
            说的接口   interface Say{  说的功能}

            两个子类
               哑巴类  Dumb  Person的子类
               聋子类  Deaf  Person 的子类
         利用面向对象思想,使用多态的方式,调用两个子类的功能
     */
    public static void main(String[] args) {

        Deaf d = new Deaf("aa",33);
        System.out.println(d);
        System.out.println(d.toString());

        /*Person p1 = new Deaf();
        p1.eat();
        p1.show();
        p1.sleep();
        // p1.say(); // 多态状态下 不能访问子类特有的成员
        // 向下转型  目标数据类型 对象名= (目标数据类型)需要强转的对象;
        Deaf d1 = (Deaf)p1;
        d1.say();
        System.out.println("-----------------");

        Person p2 = new Dumb();
        p2.eat();
        p2.show();
        p2.sleep();
        // p2.hear(); // 多态状态下 不能访问子类特有的成员
        // 向下转型  目标数据类型 对象名= (目标数据类型)需要强转的对象;
        Dumb d2 = (Dumb)p2;
        d2.hear();
*/
    }
}
