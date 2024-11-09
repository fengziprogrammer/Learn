package com.itheima.file_demo;

import java.io.File;
import java.io.IOException;

/*
    File类的创建功能 :
        1 public boolean createNewFile()	 : 创建一个新的空的文件
        2 public boolean mkdir()	: 创建一个单级文件夹
        3 public boolean mkdirs() : 创建一个多级文件夹  !!!
 */
public class FileDemo2 {
    public static void main(String[] args) throws IOException {
        File f = new File("day10_demo\\abc.txt");
        // 1 public boolean createNewFile()	 : 创建一个新的空的文件
        // System.out.println(f.createNewFile());

        File f2 = new File("day10_demo\\aaa");
        // 2 public boolean mkdir()	: 创建一个单级文件夹
        // System.out.println(f2.mkdir());

        // 3 public boolean mkdirs() : 创建一个多级文件夹  !!!
        File f3 = new File("day10_demo\\aaa\\bbb\\ccc");
        System.out.println(f3.mkdirs());
    }
}