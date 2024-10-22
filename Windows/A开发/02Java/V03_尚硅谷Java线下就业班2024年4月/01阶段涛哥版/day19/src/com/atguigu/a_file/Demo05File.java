package com.atguigu.a_file;

import java.io.File;

public class Demo05File {
    public static void main(String[] args) throws Exception{
        File file1 = new File("E:\\Idea\\io\\1.txt");
        System.out.println("file1.delete() = " + file1.delete());

        System.out.println("===============================");

        File file2 = new File("E:\\Idea\\io\\haha");
        System.out.println("file2.delete() = " + file2.delete());
    }
}
