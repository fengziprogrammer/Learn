package com.itheima.objectstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //创建序列化流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("files/user.txt"));

        //创建用户对象
        User user = new User();
        user.setName("itheima");
        user.setAge(23);
        user.setAddress("上海");

        //把对象写入到文件中
        oos.writeObject(user);

        //释放资源
        oos.close();
    }
}
