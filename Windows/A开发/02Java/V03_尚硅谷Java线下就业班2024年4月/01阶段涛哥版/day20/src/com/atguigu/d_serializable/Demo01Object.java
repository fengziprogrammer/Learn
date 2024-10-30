package com.atguigu.d_serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

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
        ArrayList<Person> list = (ArrayList<Person>) ois.readObject();
        for (Person person : list) {
            System.out.println(person);
        }
        ois.close();
    }

    /**
     * 序列化:ObjectOutputStream
     */
    private static void write()throws Exception {
        ObjectOutputStream oos =
                new ObjectOutputStream(new FileOutputStream("day20_IO\\io\\object.txt"));

        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("张三",10));
        list.add(new Person("李四",12));
        list.add(new Person("王五",14));
        list.add(new Person("赵六",16));

        oos.writeObject(list);
        oos.close();
    }
}
