package com.atguigu.c_serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Demo01Object {
    public static void main(String[] args)throws Exception {
        //write();
        read();
    }

    /**
     * 反序列化:ObjectInputStream
     */
    private static void read()throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day20_IO\\io\\object.txt"));
        Object o = ois.readObject();
        System.out.println(o);
        ois.close();
    }

    /**
     * 序列化:ObjectOutputStream
     */
    private static void write()throws Exception {
        ObjectOutputStream oos =
                new ObjectOutputStream(new FileOutputStream("day20_IO\\io\\object.txt"));
        oos.writeObject(new Person("张三",18));
        oos.close();
    }
}
