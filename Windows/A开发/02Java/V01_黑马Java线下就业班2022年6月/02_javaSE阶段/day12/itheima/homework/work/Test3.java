package com.itheima.homework.work;

import java.io.*;

/*
​	现有一字符串：”我爱Java”。将该字符串保存到当前项目根目录下的a.txt文件中。

​	要求：使用gbk编码保存。

​	注意：idea的默认编码是utf-8,所以可以通过file -> settings -> file encodings设置为gbk格式，否则打开a.txt文件看到的将会是乱码。
 */
public class Test3 {
    public static void main(String[] args) throws IOException {
        // 创建转换流对象 - 输出流
        // OutputStreamWriter osw = new OutputStreamWriter(字节输出流 , 编码表);
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day13_demo\\a.txt"), "GBK");
        osw.write("我爱Java");
        osw.close();

    }
}
