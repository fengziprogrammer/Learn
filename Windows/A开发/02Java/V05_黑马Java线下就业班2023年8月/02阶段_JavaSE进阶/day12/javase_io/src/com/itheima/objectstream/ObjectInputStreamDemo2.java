package com.itheima.objectstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class ObjectInputStreamDemo2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //创建反序列化流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("files/userList.txt"));

        //使用反序列化流读取文件中的对象
        List<User> userList = (List<User>) ois.readObject();

        //释放资源
        ois.close();

        //测试
        for (User user : userList) {
            System.out.println(user.getName() +"  "+user.getAge());
        }

    }
}
