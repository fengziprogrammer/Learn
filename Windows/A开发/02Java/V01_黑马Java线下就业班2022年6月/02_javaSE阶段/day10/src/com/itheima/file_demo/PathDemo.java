package com.itheima.file_demo;

import java.io.File;
import java.io.IOException;

/*
    绝对路径 : 以盘符开始
    相对路径 : 相对于IDEA工具项目下
 */
public class PathDemo {
    public static void main(String[] args) throws IOException {
        File f = new File("D:\\a.txt");
        f.createNewFile();

        File f2 = new File("day10_demo\\a.txt");
        f2.createNewFile();
    }
}