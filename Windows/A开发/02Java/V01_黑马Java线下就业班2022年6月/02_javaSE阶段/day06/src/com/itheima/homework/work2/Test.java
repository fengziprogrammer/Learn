package com.itheima.homework.work2;

import java.util.HashSet;

/*
    请按以下要求顺序编码：

    1. 定义学生类Student，属性：姓名、性别、年龄

    2. 定义测试类，及main()方法

    3. 创建三个Student对象，分别设置以下数据：

       ```java
       张三,男,20
       李四,女,21
       张三,男,20
       ```

    4. 定义一个存储Student类型的HashSet集合，将上述三个对象存储到Set集合中，要求集合中不能存储姓名,性别,年龄相同的元素。

    5. 使用增强for遍历集合，获取集合中每个Student对象，并打印属性值；
 */
public class Test {
    public static void main(String[] args) {
        // 创建集合对象 : 保证元素唯一性
        HashSet<Student> hs = new HashSet<>();

        Student s1 = new Student("张三",20 , "男");
        Student s2 = new Student("李四",21 , "男");
        Student s3 = new Student("张三",20 , "男");

        // 添加元素
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);

        // 遍历
        for (Student s : hs) {
            System.out.println(s);
        }
    }
}
