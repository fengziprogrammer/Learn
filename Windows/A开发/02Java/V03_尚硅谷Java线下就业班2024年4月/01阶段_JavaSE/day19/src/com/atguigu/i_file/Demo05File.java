package com.atguigu.i_file;

import java.io.File;
import java.io.IOException;

public class Demo05File {
    public static void main(String[] args) throws IOException {
//        boolean createNewFile()  -> 创建文件
//        如果指定的文件已经存在,创建失败,返回false
//        如果指定的文件不存在,创建成功,返回true
        File file1 = new File("day19_thread_file\\1.txt");
        System.out.println("file1.createNewFile() = " + file1.createNewFile());

       /* boolean mkdirs() -> 创建文件夹(目录)既可以创建多级文件夹,还可以创建单级文件夹
        如果指定的文件夹已经存在,创建失败,返回false
        如果指定的文件夹不存在,创建成功,返回true*/

        File file2 = new File("E:\\Idea\\io\\haha\\hehe\\xixi\\hiahia");
        System.out.println("file2.mkdirs() = " + file2.mkdirs());

    }
}
