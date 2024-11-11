package com.itheima.objectstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ObjectOutputStreamDemo2 {
    public static void main(String[] args) throws IOException {
        //创建序列化流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("files/userList.txt"));

        //创建用户对象
        User user1 = new User();
        user1.setName("itheima");
        user1.setAge(23);
        User user2 = new User();
        user2.setAge(22);
        user2.setName("admin");
        //集合对象
        List<User> userList = new ArrayList<>();
        Collections.addAll(userList , user1 ,user2);

        //使用序列化流，向文件中写入集合对象（集合中存储的元素必须有实现Serializable接口）
        oos.writeObject(userList);

        //释放资源
        oos.close();
    }
}
