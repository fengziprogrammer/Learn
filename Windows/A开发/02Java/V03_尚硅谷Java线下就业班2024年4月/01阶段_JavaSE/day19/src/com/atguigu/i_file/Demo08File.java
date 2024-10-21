package com.atguigu.i_file;

import java.io.File;

public class Demo08File {
    public static void main(String[] args) {
        File file = new File("E:\\Idea\\io\\aa");
        //String[] list() -> 遍历指定的文件夹,返回的是String数组
        String[] list = file.list();
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("=======================");
        //File[] listFiles()-> 遍历指定的文件夹,返回的是File数组
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1);
        }
    }
}
