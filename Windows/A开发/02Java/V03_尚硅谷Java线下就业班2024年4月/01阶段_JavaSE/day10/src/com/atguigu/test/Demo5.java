package com.atguigu.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.TreeSet;

/*

    Java中常见的接口
        Runnable
        Comparable
        一般情况下 接口只有一个抽象方法  目的就是为了扩展对应的方法

     真实开发的应用
     接口的设计原则
        提供了规则,扩展功能

        Person[] arr = new Person[3];

       // TreeSet 容器 装的元素类似 Person  功能 去重    原理: 比较两个对象的差值
        TreeSet<Person> set = new TreeSet();
        set.add(new Person("张三",23));
        set.add(new Person("张三",23));

 */
public class Demo5 {

    public static void main(String[] args) throws Exception {
       /* TreeSet<Student2> set = new TreeSet();
        set.add(new Student2("aa",11));
        set.add(new Student2("aa",11));
        set.add(new Student2("bb",22));
        set.add(new Student2("bb",22));
        set.add(new Student2("cc",33));
        System.out.println(set);*/

        // 作用  可以将一个对象 写入到内存中     序列化
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("000.txt"));
        oos.writeObject(new Student2("dd",44));
    }
}

// NotSerializableException
class Student2 implements Comparable, Serializable {
    String name;
    int age;

    public Student2() {
    }

    public Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
