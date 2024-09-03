package com.itheima.polymorphic_test;
/*
    关键字 :  instanceof

    使用格式： 对象名 instanceof 引用数据类型

     作用 : 判断一个对象是否属于一种引用数据类型 , 返回boolean类型结果

    通俗的理解：判断关键字左边的变量，是否是右边的类型，返回boolean类型结果


 */
public class InstanceofDemo {
    public static void main(String[] args) {
        Animal a = new Cat();

        // 对象名 instanceof 引用数据类型
        System.out.println(a instanceof Animal);
        System.out.println(a instanceof Cat);
        System.out.println(a instanceof Dog);
    }
}
