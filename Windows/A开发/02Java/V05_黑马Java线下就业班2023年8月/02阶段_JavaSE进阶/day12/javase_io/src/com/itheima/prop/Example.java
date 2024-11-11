package com.itheima.prop;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) throws IOException {
        //创建对象
        Properties properties = new Properties();

        //读取配置
        properties.load( new FileInputStream("student.properties"));
        System.out.println(properties);

        //从Properties中分别获取：姓名、年龄
        String name  = properties.getProperty("studentName");
        String age = properties.getProperty("studentAge");

        //创建Student对象
        Student stu = new Student(name , Integer.parseInt(age));

        System.out.println(stu);
    }
}
