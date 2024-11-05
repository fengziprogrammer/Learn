package com.atguigu.b_serializable;

import java.io.*;
import java.util.ArrayList;

public class Demo01Serializable {
    public static void main(String[] args) throws Exception {
        //write();
        read();
    }

    /**
     * 1.概述:ObjectInputStream extends InputStream
     * 2.作用:读对象
     * 3.构造:
     * ObjectInputStream(InputStream in)
     * 4.方法:
     * Object readObject()
     */
    private static void read() throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day21_IO_Net\\person.txt"));
        ArrayList<Person> list = (ArrayList<Person>) ois.readObject();
        for (Person person : list) {
            System.out.println(person);
        }
        ois.close();
    }

    /**
     * 1.概述:ObjectOutputStream extends OutputStream
     * 2.构造:
     * ObjectOutputStream(OutputStream out)
     * 3.方法:
     * void writeObject(Object obj)  -> 写对象
     */
    private static void write() throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day21_IO_Net\\person.txt"));
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("金莲", 26));
        list.add(new Person("大郎", 32));
        list.add(new Person("西门大官人", 28));

        oos.writeObject(list);

        oos.close();
    }
}
