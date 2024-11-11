package com.itheima.digui;

import java.io.File;
import java.io.FileInputStream;

public class Test1 {
    public static void main(String[] args) {
        //目录对象
        File f = new File("f:/files");

        getJavaFile(f);

    }
    //打印指定目录下所有的java文件
    public static void getJavaFile(File file){
        //判断：给定的File对象是否存在
        if(!file.exists()){
            throw  new RuntimeException("给定的File对象不存在!");
        }

        //获取给定目录下所有的文件和目录
        File[] files = file.listFiles();

        //遍历数组
        for (File f : files) {
             //判断：是文件
            if(f.isFile()){
                //判断：是否为java文件
                if(f.getName().endsWith(".java")){
                    System.out.println(f.getAbsolutePath());
                }
            }else if(f.isDirectory()){//判断：是目录
                //递归调用： 把当前File对象作为参数传递
                getJavaFile(f);
            }
        }
    }
}
