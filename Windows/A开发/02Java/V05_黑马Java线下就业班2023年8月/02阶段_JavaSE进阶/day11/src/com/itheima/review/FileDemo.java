package com.itheima.review;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        //File类： 用来描述磁盘上的文件或文件夹(目录)

        //创建File对象
        File f = new File("files/hello.txt");//相对路径
        System.out.println("判断给定的路径(文件路径or目录路径)是否存在："+f.exists());
        System.out.println("判断给定的File对象是文件："+ f.isFile());
        System.out.println("判断给定的File对象是目录："+ f.isDirectory());

        System.out.println("文件名|目录名："+f.getName());
        System.out.println("绝对路径："+f.getAbsolutePath());
        System.out.println("文件大小："+f.length());

        //文件or目录的基本操作： 创建、删除    （ File类不能操作文件中存储的内容 ）
        f.createNewFile();
        f.delete();//在删除文件夹时，必须保证文件夹是空文件夹

        //学习File的目的，是为了配合IO流使用

    }
}
