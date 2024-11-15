package com.itheima.writer_demo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
    需求 : 将用户键盘录入的用户名和密码保存到本地实现永久化存储。
    要求 : 用户名和密码在文件中各占一行

    步骤：
        1 用户键盘录入用户名
        2 创建字符输出流对象
        3 将用户名和密码写到本地文件中
 */
public class WriterTest {
    public static void main(String[] args) throws IOException {
        // 1 用户键盘录入用户名
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String username = sc.nextLine();
        System.out.println("请输入密码:");
        String password = sc.nextLine();

        // 2 创建字符输出流对象
        FileWriter fw = new FileWriter("day11_demo\\user.txt");

        // 3 将用户名和密码写到本地文件中
        fw.write(username);
        fw.write("\r\n");
        fw.flush();
        fw.write(password);
        fw.write("\r\n");
        fw.flush();

        fw.close();
    }
}