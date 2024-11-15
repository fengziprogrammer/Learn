package com.itheima.objectstream_demo;

import java.io.*;

/*
    对象操作流 :
        对象操作输出流（对象序列化流）：就是将对象写到本地文件中，或者在网络中传输对象
    ObjectOutputStream :
        对象操作输出流（对象序列化流）：就是将对象写到本地文件中，或者在网络中传输对象
    ObjectInputStream :
        对象操作输入流（对象反序列化流）：把写到本地文件中的对象读到内存中，或者接收网络中传输的对象

    练习 : 使用对象操作输出流 , 把一个User对象写入文件中  , 在使用对象操作输入流读取对象数据

    1 用对象序列化流序列化了一个对象后，假如我们修改了对象所属的Javabean类，读取数据会不会出问题呢？
        会出现问题 : 发生异常InvalidClassException

    2 如果出问题了，如何解决呢？
        给当前类加上一个写死的序列号 :   private static final long serialVersionUID = 数值L;


    3 如果一个对象中的某个成员变量的值不想被序列化，又该如何实现呢？
        给此成员变量加上一个修饰符(关键字) : transient

 */
public class ObjectStreamDemo2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        method1();

        // 1 创建对象反序列化流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day11_demo\\user.txt"));
        // 2 读数据
        User user = (User) ois.readObject();
        System.out.println(user);
    }

    private static void method1() throws IOException {
        // 1 创建对象序列化流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day11_demo\\user.txt"));

        // 2 写数据
        oos.writeObject(new User("柳岩", "123456"));

        // 3 释放资源
        oos.close();
    }
}