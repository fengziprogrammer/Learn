package com.itheima.objectstream_demo;

import java.io.*;
import java.util.ArrayList;

/*
    需求：创建多个Javabean类对象写到文件中，再次读取到内存。

    思路：
        1 创建学生对象
        2 利用对象操作输出流写到本地
        3 利用对象操作输入流读到内存
 */
@SuppressWarnings(value = "all")
public class ObjectStreamTest2 {
    public static void main(String[] args) throws Exception {
        // 写数据
        method1();

        // 利用对象操作输入流读到内存
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day11_demo\\student.txt"));
        // 读数据
        ArrayList<Student> list = (ArrayList<Student>) ois.readObject();
        // 遍历集合
        for (Student s : list) {
            System.out.println(s);
        }

    }

    private static void method1() throws IOException {
        // 2 利用对象操作输出流写到本地
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day11_demo\\student.txt"));

        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("刘备", 40));
        list.add(new Student("关羽", 30));
        list.add(new Student("张飞", 20));

        // 写数据
        oos.writeObject(list);

        // 释放资源
        oos.close();
    }
}