package com.itheima.objectstream_demo;

import java.io.*;

/*
    对象操作流 :
    ObjectOutputStream :
        对象操作输出流（对象序列化流）：就是将对象写到本地文件中，或者在网络中传输对象
    ObjectInputStream :
        对象操作输入流（对象反序列化流）：把写到本地文件中的对象读到内存中，或者接收网络中传输的对象

    练习 : 使用对象操作输出流 , 把一个User对象写入文件中  , 在使用对象操作输入流读取对象数据

    注意 : 如果一个类对象想要被序列化 , 那么此类需要实现Serializable接口
    Serializable接口的含义 :
        1 是一个标记性接口 , 里面没有任何抽象方法
        2 只要一个类实现了此接口 , 表示此类的对象可以被序列化
 */
public class ObjectStreamDemo1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 1 创建对象操作输入流(反序列化流)
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day11_demo\\user.txt"));
        User o = (User) ois.readObject();
        System.out.println(o);
        ois.close();
    }

    private static void method1() throws IOException {
        // 1 创建对象操作输出流(对象序列化流)
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day11_demo\\user.txt"));

        // 2 创建User对象
        User user = new User("柳岩" , "123456");

        // 3 把对象写到文件中
        oos.writeObject(user);

        // 4 释放资源
        oos.close();
    }
}