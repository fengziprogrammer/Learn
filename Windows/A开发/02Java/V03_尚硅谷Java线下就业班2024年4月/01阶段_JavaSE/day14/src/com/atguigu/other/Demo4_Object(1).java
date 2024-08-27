package com.atguigu.other;

import com.atguigu.bean.Person;

public class Demo4_Object {

    /*
    equals()
        默认比较的是地址值
        一般重写
            重写后比较的是  该对象的属性值
            约定
                如果两个对象,数据类型一致,属性值一致 -> 相同的对象

      面试题
        == 与equals()的区别2
            == 运算符  判断是否相等
                既可以比较基本数据类型(值),也可以比较引用数据类型 (地址值)
            equals()  Object里面的方法
                只可以比较引用数据类型
                    默认比较的是地址值 (== 一致)
                    重写后比较的是  该对象的属性值

          hashCode() 返回值 代表的是一个对象的哈希值
                默认情况下 依据的是当前对象的地址值进行计算
                    结论
                        1.同一个对象多次调用的哈希值一定一样
                        2.不同对象的哈希值一定不一样
                重写后,依据的是当前对象的属性值
                    一般情况下 需要重写
                       如果两个对象,数据类型一致,属性值一致 -> 哈希值一定一致
                       反之则不成立 例(求绝对值)

        getClass()  返回值类型 Class 获取对象的运行时类型(字节码类型)
         // Student  stu
        Class aClass = p1.getClass();
     */
    public static void main(String[] args) {

       /* Person p1 = new Person("张三",23);
        Person p2 = new Person("张三",23);
        *//*System.out.println(p1 ==p2);
        System.out.println(p1.equals(p2));*//*

        System.out.println(p1.hashCode());// 21685669
        System.out.println(p1.hashCode());//21685669
        System.out.println(p2.hashCode());//2133927002*/

        Person p1 = new Person("张三",23);
        Person p2 = new Person("张三",23);

        // Student  stu
        Class aClass = p1.getClass();//  aClass  获取对象的运行时类型(字节码类型)
        Class bClass = p2.getClass();
        System.out.println(aClass);
        System.out.println(bClass);
        System.out.println(aClass == bClass);


    }
}


