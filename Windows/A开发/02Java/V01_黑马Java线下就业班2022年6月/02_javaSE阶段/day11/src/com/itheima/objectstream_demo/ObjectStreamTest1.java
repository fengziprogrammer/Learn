package com.itheima.objectstream_demo;

import java.io.*;

/*
    需求：创建多个Javabean类对象写到文件中，再次读取到内存。

    思路：
        1 创建学生对象
        2 利用对象操作输出流写到本地
        3 利用对象操作输入流读到内存
 */
public class ObjectStreamTest1 {
    public static void main(String[] args) throws Exception {
        // 利用对象操作输入流读到内存
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day11_demo\\student.txt"));
        // 读数据
//        Student s1 = (Student) ois.readObject();
//        System.out.println(s1);
//        Student s2 = (Student) ois.readObject();
//        System.out.println(s2);
//        Student s3 = (Student) ois.readObject();
//        System.out.println(s3);
//        Student s4 = (Student) ois.readObject();
//        System.out.println(s4);

        while (true) {
            try {
                Student s1 = (Student) ois.readObject();
                System.out.println(s1);
            } catch (EOFException e) {
                // System.out.println("达到文件的末尾!");
                break;
            }
        }

    }

    private static void method1() throws IOException {
        // 2 利用对象操作输出流写到本地
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day11_demo\\student.txt"));
        oos.writeObject(new Student("刘备", 40));
        oos.writeObject(new Student("关羽", 30));
        oos.writeObject(new Student("张飞", 20));
        // 释放资源
        oos.close();
    }
}