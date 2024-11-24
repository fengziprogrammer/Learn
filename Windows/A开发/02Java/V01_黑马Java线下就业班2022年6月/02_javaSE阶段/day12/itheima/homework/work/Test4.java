package com.itheima.homework.work;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
    需求：

    1. 定义一个学生类，包含姓名，年龄，性别等成员变量，提供setters和getters方法以及构造方法。

    2. 在测试类中创建一个学生对象，给学生对象的三个成员变量赋值。然后将该对象保存到当前项目根目录下的stu.txt文件中。

    **思路**

    1. 定义学生类并实现序列化接口和测试类

    2. 在测试类中创建学生对象

    3. 创建文件字节输出流对象并关联目标文件

    4. 根据文件字节输出流对象创建对象输出流对象

    5. 调用对象输出流对象的方法将学生对象保存到文件中

    6. 关闭流释放资源
 */
public class Test4 {
    public static void main(String[] args) throws Exception {
        method1();

        // 对象操作输入流(反序列化流)
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day13_demo\\student.txt"));

        List<Student> list = (List<Student>) ois.readObject();

        for (Student s : list) {
            System.out.println(s);
        }
    }

    public static void method1() throws IOException {
        // 对象操作输出流(序列化流)
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day13_demo\\student.txt"));

        List<Student> stuList = new ArrayList<>();
        // 创建学生对象
        stuList.add(new Student("迪丽热巴", "女", 18, 99));
        stuList.add(new Student("古力娜扎", "女", 19, 98));
        stuList.add(new Student("周杰伦", "男", 20, 88));
        stuList.add(new Student("蔡徐坤", "男", 19, 78));

        // 往文件中写入一个集合对象
        oos.writeObject(stuList);

        oos.close();
    }
}
