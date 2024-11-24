package com.itheima.homework.work;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

/*
    请编写main()方法，定义一个字符缓冲输入流BufferedReader对象，
    读取”test1_4.txt”文件，一次读取一行，将每行数据封装为一个Student对象，
    并将Student对象存储到一个集合。遍历并打印集合的所有Student信息。
 */
public class Test2 {
    public static void main(String[] args) throws Exception {
        // 创建集合对象
        ArrayList<Student> list = new ArrayList<>();

        // 创建高效的字符输入流
        BufferedReader br = new BufferedReader(new FileReader("day13_demo\\test1_4.txt"));

        // 把读到的每一行数据 封装成学生对象在添加到集合
        String line;
        while ((line = br.readLine()) != null) {
            // "迪丽热巴,女,18,99"
            String[] str = line.split(",");
            // 封装成学生对象
            Student s = new Student(str[0], str[1], Integer.parseInt(str[2]), Integer.parseInt(str[3]));
            // 学生对象在添加到集合
            list.add(s);
        }

        // 释放资源
        br.close();

        // 遍历集合
        for (Student s : list) {
            System.out.println(s);
        }
    }
}
