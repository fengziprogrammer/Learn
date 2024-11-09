package com.itheima.file_demo;

import java.io.File;

/*
    File类删除功能 :
        public boolean delete()	删除由此抽象路径名表示的文件或目录

        注意 :
            1 delete方法直接删除不走回收站。
            2 如果删除的是一个文件，直接删除。
            3 如果删除的是一个文件夹，空文件夹直接删掉 , 有内容文件夹需要先删除子文件
 */
public class FileDemo3 {
    public static void main(String[] args) {
        File f = new File("day10_demo\\abc.txt");
        // public boolean delete()	删除由此抽象路径名表示的文件或目录
        // System.out.println(f.delete());

        File f2 = new File("day10_demo\\aaa");
        System.out.println(f2.delete());
    }
}
