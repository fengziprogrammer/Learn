package com.itheima.is;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class InputStreamDemo2 {
    //演示：read(byte[] buf)方法的使用
    public static void main(String[] args) throws IOException {
        //创建字节输入流
        FileInputStream fis = new FileInputStream("files/helloworld.txt");

        //定义字节数组
        byte[] buf = new byte[5];

        //第1次读取数据
        int len = fis.read(buf);
        System.out.println("第1次实际读取到的字节数据个数：" + len);
        System.out.println("第1次读取到的字节数据：" + Arrays.toString(buf));
        System.out.println("第1次读取的数据：" + new String(buf, 0, len));//byte[] -> String
        //第2次读取数据
        len = fis.read(buf);
        System.out.println("第2次实际读取到的字节数据个数：" + len);
        System.out.println("第2次读取到的字节数据：" + Arrays.toString(buf));
        System.out.println("第2次读取的数据：" + new String(buf, 0, len));
        //第3次读取数据
        len = fis.read(buf);
        System.out.println("第3次实际读取到的字节数据个数：" + len);
        System.out.println("第3次读取到的字节数据：" + Arrays.toString(buf));
        System.out.println("第3次读取的数据：" + new String(buf, 0, len));
        //String(byte[])
        //String(byte[] , 开始索引 ， 获取长度) //把byte数组中从 开始索引 位置，向后获取指定长度的 字节数据，转换为String

        //释放流
        fis.close();
    }
}
