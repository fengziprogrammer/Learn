package com.atguigu.i_file;

import java.io.File;

public class Demo03File {
    public static void main(String[] args) {
        /*File(String parent, String child) 根据所填写的路径创建File对象
        parent:父路径
        child:子路径*/
        File file = new File("E:\\Idea\\","io\\27.jpg");
        System.out.println("file = " + file);
       /* File(File parent, String child)  根据所填写的路径创建File对象
        parent:父路径,是一个File对象
        child:子路径*/
        File parent = new File("E:\\Idea");
        File file1 = new File(parent, "io\\27.jpg");
        System.out.println("file1 = " + file1);
       /* File(String pathname)  根据所填写的路径创建File对象
        pathname:直接指定路径*/
        File file2 = new File("E:\\Idea\\io\\27.jpg");
        System.out.println("file2 = " + file2);
    }
}
