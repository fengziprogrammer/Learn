package com.itheima.properties_demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/*
    需求：在properties文件中手动写上姓名和年龄，读取到集合中，将该数据封装成javabean对象
 */
public class PropertiesTest {
    public static void main(String[] args) throws IOException {
        // 1 创建集合对象
        Properties properties = new Properties();
        // 2 把文件中的数据加载到集合中
        properties.load(new FileInputStream("day10_demo\\src\\user.properties"));

        // System.out.println(properties); // {password=123456, username=zhangsan}

        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

        // 把集合中的数据取出封装成用户对象
        User user = new User(username , password);
        System.out.println(user);

    }
}