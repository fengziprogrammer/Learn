package com.itheima.commons;

import org.apache.commons.io.IOUtils;

import java.io.*;

public class Test1 {
    //IOUtils类的使用
    public static void main(String[] args) throws FileNotFoundException {
        //复制文件
        //源文件
        InputStream src = new FileInputStream("f:/files/111.jpg");
        //目标文件
        OutputStream dest = new FileOutputStream("files/123.jpg");

        //使用IOUtils工具类
        try {
            IOUtils.copy(src,dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
