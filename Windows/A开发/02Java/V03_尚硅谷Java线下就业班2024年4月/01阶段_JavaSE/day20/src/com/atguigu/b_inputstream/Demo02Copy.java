package com.atguigu.b_inputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Demo02Copy {
    public static void main(String[] args) throws Exception {
        //1.创建FileInputStream用来读取图片字节
        FileInputStream fis = new FileInputStream("E:\\Idea\\io\\27.jpg");
        //2.创建FileOutputStream用来将读取的图片字节写到指定位置
        FileOutputStream fos = new FileOutputStream("E:\\Idea\\io\\xx姐姐.jpg");
        //3.一次读取一个字节数组 -> 长度习惯上都是定1024或者其倍数
        byte[] bytes = new byte[1024];

        //4.边读边写
        int len = 0;
        while((len = fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }

        //5.关流 -> 习惯上先开的后关
        fos.close();
        fis.close();
    }
}
