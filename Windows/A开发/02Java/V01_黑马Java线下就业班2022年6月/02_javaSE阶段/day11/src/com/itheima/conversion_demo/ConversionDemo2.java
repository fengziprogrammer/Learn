package com.itheima.conversion_demo;

import java.io.*;

/*
    转换流就是来进行字节流和字符流之间转换的桥梁

    InputStreamReader是从字节流到字符流的桥梁
        public InputStreamReader(InputStream in) : 创建一个使用默认编码的 InputStreamReader。
        public InputStreamReader(InputStream in ,  String charsetName) : 创建使用指定编码的 InputStreamReader。

    OutputStreamWriter是从字符流到字节流的桥梁
        public OutputStreamWriter(OutputStream out) : 创建使用默认字符编码的 OutputStreamWriter
        public OutputStreamWriter(OutputStream out,  String charsetName) : 创建使用指定编码的 OutputStreamWriter

    需求2 :  将模块根目录中GBK编码的文本文件 , 转换为UTF-8编码的文本文件
 */
public class ConversionDemo2 {
    public static void main(String[] args) throws IOException {
        // 1 创建转换流对象(输入)
        InputStreamReader isr = new InputStreamReader(new FileInputStream("day11_demo\\GBK编码文件.txt"), "GBK");
        // 2 创建转换流对象(输出)
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day11_demo\\UTF-8编码文件.txt"), "UTF-8");

        // 3 使用编码为GBK的输入流读 , 使用UTF-8编码的流写到一个新的文件中
        int ch;
        while((ch = isr.read()) != -1){
            osw.write(ch);
            osw.flush();
        }

        // 4 释放资源
        isr.close();
        osw.close();
    }
}