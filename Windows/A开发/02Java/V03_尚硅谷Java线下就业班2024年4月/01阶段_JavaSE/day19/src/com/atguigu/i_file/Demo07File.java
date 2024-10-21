package com.atguigu.i_file;

import java.io.File;

public class Demo07File {
    public static void main(String[] args) {
        File file = new File("E:\\Idea\\io\\1.txt");
        //boolean isDirectory() -> 判断是否为文件夹
        System.out.println("file.isDirectory() = " + file.isDirectory());
        //boolean isFile()  -> 判断是否为文件
        System.out.println("file.isFile() = " + file.isFile());
        //boolean exists()  -> 判断文件或者文件夹是否存在
        System.out.println("file.exists() = " + file.exists());
    }
}
