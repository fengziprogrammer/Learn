package com.itheima.singledesign;

/*
    需求 : 使用单例模式(懒汉式) , 要求此类只能有一个对象

    步骤 :
        1. 将构造方法私有化，使其不能在类的外部通过new关键字实例化该类对象。
        2. 在该类内部定义一个private static修饰的成员变量 . 此变量不需要赋值
        3. 定义一个静态方法返回这个唯一对象。 此方法需要加上synchronized关键字保证在多线程中也只有一个实例对象
 */
public class King2 {
    // 1. 将构造方法私有化，使其不能在类的外部通过new关键字实例化该类对象。
    private King2() {
    }

    //  2. 在该类内部定义一个private static修饰的成员变量 . 此变量不需要赋值
    private static King2 king2;

    // 3. 定义一个静态方法返回这个唯一对象。 此方法需要加上synchronized关键字保证在多线程中也只有一个实例对象
    public static synchronized King2 getInstance() {
        if (king2 == null) {
            king2 = new King2();
        }
        return king2;
    }
}

