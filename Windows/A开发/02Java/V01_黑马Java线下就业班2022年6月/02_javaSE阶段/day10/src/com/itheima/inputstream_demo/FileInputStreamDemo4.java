package com.itheima.inputstream_demo;

import java.io.FileOutputStream;
import java.io.IOException;

/*
    JDK7版本之前处理方式 :
        try...catch ...finally
 */
public class FileInputStreamDemo4 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            // System.out.println(3 / 0);
            // 1 创建字节输出流对象
            fos = new FileOutputStream("day10_demo\\abc.txt");
            // 2 写数据
            fos.write(97);
            fos.write(98);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                // 3 释放资源
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}