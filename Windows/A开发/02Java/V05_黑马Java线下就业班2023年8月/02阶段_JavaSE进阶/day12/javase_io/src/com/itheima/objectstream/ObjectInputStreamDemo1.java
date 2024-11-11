package com.itheima.objectstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //创建反序列化流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("files/user.txt"));

        //读取文件中的对象
        User user = (User) ois.readObject();

        //释放资源
        ois.close();

        //测试
        System.out.println(user);
    }
}
