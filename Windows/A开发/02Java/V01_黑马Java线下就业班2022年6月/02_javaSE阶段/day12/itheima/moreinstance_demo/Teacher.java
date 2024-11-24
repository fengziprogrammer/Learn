package com.itheima.moreinstance_demo;

import java.util.ArrayList;
import java.util.Random;

/*
    需求  : 某一个学科有固定3位老师，年级中上该课程的老师就是这三位老师其中一位
            要求使用多例模式 ,每次获取的都是这三位老师其中一位

    实现步骤 :
        1.创建一个类,  将构造方法私有化，使其不能在类的外部通过new关键字实例化该类对象。
        2.在类中定义该类被创建对象的总数量
        3.在类中定义存放类实例的list集合
        4.在类中提供静态代码块,在静态代码块中创建类的实例
        5.提供获取类实例的静态方法
 */
public class Teacher {
    // 1.创建一个类,  将构造方法私有化，使其不能在类的外部通过new关键字实例化该类对象。
    private Teacher() {
    }

    // 2.在类中定义该类被创建对象的总数量
    private static int maxCount = 3;

    // 3.在类中定义存放类实例的list集合
    private static ArrayList<Teacher> list = new ArrayList<>();// {teacher1  , teacher2 , teacher3}

    // 4.在类中提供静态代码块,在静态代码块中创建类的实例
    static {
        for (int i = 0; i < maxCount; i++) {
            list.add(new Teacher());
        }
    }

    // 5.提供获取类实例的静态方法
    public static Teacher getInstance() {
        int index = new Random().nextInt(3);// [0 - 2]
        return list.get(index);
    }

}
