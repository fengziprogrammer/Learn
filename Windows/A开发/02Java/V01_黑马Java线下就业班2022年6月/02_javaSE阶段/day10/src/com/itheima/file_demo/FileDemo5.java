package com.itheima.file_demo;

import java.io.File;

/*
    File类高级获取功能
        public File[] listFiles()	返回此抽象路径名表示的目录中的文件和目录的File对象数组

    listFiles方法注意事项：
        1 当调用者不存在时，返回null
        2 当调用者是一个文件时，返回null
        3 当调用者是一个空文件夹时，返回一个长度为0的数组
        4 当调用者是一个有内容的文件夹时，将里面所有文件和文件夹的路径放在File数组中返回 , 拿到儿子辈的文件 , 包含隐藏内容
 */
public class FileDemo5 {
    public static void main(String[] args) {
        // File f = new File("C:\\Program Files\\Internet Explorer");
        File f = new File("day10_demo\\aaa\\bbb");

        // public File[] listFiles()	返回此抽象路径名表示的目录中的文件和目录的File对象数组
        File[] files = f.listFiles();
        // System.out.println(files.length);
        for (File file : files) {
            System.out.println(file.getName());
        }

    }
}