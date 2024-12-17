package io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 对象流:java.io.ObjectOutputStream和ObjectInputStream
 * 对象流是一对高级流，可以方便我们读写java对象。
 */
public class OOSDemo {
    public static void main(String[] args) throws IOException {
        String name = "苍老师";
        int age = 18;
        String gender = "女";
        String[] otherInfo = {"是一名演员","来自日本","广大男性同胞的启蒙老师","台词较少"};
        Person p = new Person(name,age,gender,otherInfo);
        System.out.println(p);

        //将一个Person实例写入文件person.obj中
        FileOutputStream fos = new FileOutputStream("person.obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        /*
            void writeObject(Object obj)
            对象输出流提供了一个写出对象的方法，但是在写出对象时要求该对象所属的
            类必须实现了接口:java.io.Serializable，否则会抛出异常。

            当我们调用writeObject方法将一个对象写出时，首先该对象经过对象
            它会将该对象按照其结构转换为一组字节，这个过程称为对象序列化
            序列化后的字节再经过对象流连接的文件流写出。而文件流会将这些字节
            最终写入到文件中(硬盘上)做长久保存。这个过程称为数据持久化。

         */
        oos.writeObject(p);
        System.out.println("写出完毕!");
        oos.close();
    }
}




