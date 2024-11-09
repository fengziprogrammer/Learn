package com.itheima.file_demo;

import java.io.File;

/*
    File类判断和获取功能
        public boolean isDirectory()	测试此抽象路径名表示的File是否为目录
        public boolean isFile()	测试此抽象路径名表示的File是否为文件
        public boolean exists()	测试此抽象路径名表示的File是否存在
        public String getAbsolutePath()	返回此抽象路径名的绝对路径名字符串
        public String getPath()	获取的是创建File对象给定的路径
        public String getName()	返回由此抽象路径名表示的文件或目录的名称
 */
public class FileDemo4 {
    public static void main(String[] args) {
        File f1 = new File("D:\\develop\\IEDA_Code\\Shanghai141_Code\\day10_demo\\a.txt");
        File f2 = new File("day10_demo\\aaa\\bbbb");

        // public boolean isDirectory()	测试此抽象路径名表示的File是否为目录
        System.out.println(f1.isDirectory());// false
        System.out.println(f2.isDirectory());// true

        // public boolean isFile()	测试此抽象路径名表示的File是否为文件
        System.out.println(f1.isFile());// true
        System.out.println(f2.isFile());// false

        // public boolean exists()	测试此抽象路径名表示的File是否存在
        System.out.println(f1.exists());
        System.out.println(f2.exists());

        // public String getAbsolutePath()	返回此抽象路径名的绝对路径名字符串
        // D:\develop\IEDA_Code\Shanghai141_Code\day10_demo\a.txt
        System.out.println(f1.getAbsolutePath());

        // public String getPath()	获取的是创建File对象给定的路径
        System.out.println(f1.getPath());
        System.out.println(f2.getPath());

        // public String getName()	返回由此抽象路径名表示的文件或目录的名称
        System.out.println(f1.getName());
        System.out.println(f2.getName());

        File f = new File("D:\\a.txt");
        System.out.println(f.isHidden());
    }
}