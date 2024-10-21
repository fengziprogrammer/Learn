package com.atguigu.i_file;

import java.io.File;

public class Demo06File {
    public static void main(String[] args) {
        File file = new File("day19_thread_file\\1.txt");
        System.out.println("file.delete() = " + file.delete());

        System.out.println("=============================");

        File file2 = new File("E:\\Idea\\io\\haha");
        System.out.println("file2.delete() = " + file2.delete());
    }
}
