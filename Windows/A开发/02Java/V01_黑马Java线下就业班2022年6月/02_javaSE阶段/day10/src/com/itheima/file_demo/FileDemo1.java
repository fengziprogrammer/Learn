package com.itheima.file_demo;

import java.io.File;

/*
    File：它是文件和目录路径名的抽象表示
         文件和目录可以通过File封装成对象
         File封装的对象仅仅是一个路径名。它可以是存在的，也可以是不存在的。
    构造方法 :
        1 File(String pathname)	通过将给定的路径名字符串转换为抽象路径名来创建新的 File实例
        2 File(String parent, String child)	从父路径名字符串和子路径名字符串创建新的 File实例
        3 File(File parent, String child)	从父抽象路径名和子路径名字符串创建新的 File实例

    注意事项 : 父路径需要是一个目录路径
 */
public class FileDemo1 {
    public static void main(String[] args) {
        // 1 File(String pathname)	通过将给定的路径名字符串转换为抽象路径名来创建新的 File实例
        File f1 = new File("D:\\a.txt");
        System.out.println(f1);

        // 2 File(String parent, String child)	从父路径名字符串和子路径名字符串创建新的 File实例
        File f2 = new File("D:\\abc" , "a.txt");
        System.out.println(f2);

        // 3 File(File parent, String child)	从父抽象路径名和子路径名字符串创建新的 File实例
        File f3 = new File(new File("D:\\abc") , "a.txt");
        System.out.println(f3);
    }
}