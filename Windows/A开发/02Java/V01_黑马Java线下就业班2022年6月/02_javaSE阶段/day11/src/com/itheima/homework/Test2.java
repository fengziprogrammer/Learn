package com.itheima.homework;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("day12_demo\\file01.txt"));

//        // 一次读一个字节
//        int by;
//        while((by = bis.read()) != -1){
//            System.out.print((char)by);
//        }

        // 一次读一个字节数组
        byte[] bys = new byte[1024];
        int len;// 记录的是每次读到数据的个数
        while ((len = bis.read(bys)) != -1) {
            System.out.print(new String(bys , 0 , len));
        }

        bis.close();
    }
}
