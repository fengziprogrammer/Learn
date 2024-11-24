package com.itheima.homework.work;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
    请按以下要求编写程序：

1. 定义一个学员类，有以下
   属性：姓名、性别、年龄、分数
   无参、全参构造方法，get/set方法

2. 定义main()方法，定义一个存储Student的集合，并初始化一些数据：

   ```
   List<Student> stuList = new ArrayList<>();
   stuList.add(new Student(“迪丽热巴”,”女”,18,99);
   stuList.add(new Student(“古力娜扎”,”女”,19,98);
   stuList.add(new Student(“周杰伦”,”男”,20,88);
   stuList.add(new Student(“蔡徐坤”,”男”,19,78);
   ```

   1. 定义一个字符缓冲输出流BufferedWriter，将学员信息写入到”test1_4.txt”中，每个学员信息占一行，每个字段之间用,符号隔开，例如：

   ```
   迪丽热巴,女,18,99
   古力娜扎,女,19,98
   周杰伦,男,20,88
   蔡徐坤,男,19,78
   ```
 */
public class Test1 {
    public static void main(String[] args) throws IOException {
        // 创建集合对象
        List<Student> stuList = new ArrayList<>();

        // 创建学生对象 , 添加到集合中
        stuList.add(new Student("迪丽热巴", "女", 18, 99));
        stuList.add(new Student("古力娜扎", "女", 19, 98));
        stuList.add(new Student("周杰伦", "男", 20, 88));
        stuList.add(new Student("蔡徐坤", "男", 19, 78));

        // 创建高效的字符输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("day13_demo\\test1_4.txt"));

        // 遍历集合
        for (Student s : stuList) {
            // bw.write(s.getName() + "," + s.getSex() + "," + s.getAge() + "," + s.getScore());
            bw.write(s.toString());
            bw.newLine();
            bw.flush();
        }

        bw.close();
    }
}
