package com.atguigu.b_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Demo04Copy {
    public static void main(String[] args)throws Exception {
        FileInputStream fis = new FileInputStream("E:\\Idea\\io\\27.jpg");
        FileOutputStream fos = new FileOutputStream("E:\\Idea\\io\\upload\\27.jpg");
        //定义一个数组
        byte[] bytes = new byte[1024];
        int len;
        while((len = fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }

        //关流-> 先开的后关
        fos.close();
        fis.close();
    }
}
