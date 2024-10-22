package com.atguigu.a_file;

import java.io.File;

public class Demo03File {
    public static void main(String[] args) {
        File file = new File("E:\\Idea\\io\\1.txt");
        //String getAbsolutePath() -> 获取File的绝对路径->带盘符的路径
        System.out.println("file.getAbsolutePath() = " + file.getAbsolutePath());
        //String getPath() ->获取的是封装路径->new File对象的时候写的啥路径,获取的就是啥路径
        System.out.println("file.getPath() = " + file.getPath());
        //String getName()  -> 获取的是文件或者文件夹名称
        System.out.println("file.getName() = " + file.getName());
        //long length() -> 获取的是文件的长度 -> 文件的字节数
        System.out.println("file.length() = " + file.length());
    }
}
