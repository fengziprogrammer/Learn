package com.atguigu.a_file;

import java.io.File;

public class Demo04File {
    public static void main(String[] args) throws Exception{
        File file1 = new File("day19_IO\\1.txt");
        /*boolean createNewFile()  -> 创建文件
        如果要创建的文件之前有,创建失败,返回false
        如果要创建的文件之前没有,创建成功,返回true*/
        System.out.println(file1.createNewFile());

        /*boolean mkdirs() -> 创建文件夹(目录)既可以创建多级文件夹,还可以创建单级文件夹
        如果要创建的文件夹之前有,创建失败,返回false
        如果要创建的文件夹之前没有,创建成功,返回true*/
        File file2 = new File("E:\\Idea\\io\\haha\\hehe\\heihei\\xixi\\hiahia");
        System.out.println(file2.mkdirs());
    }
}
