package com.itheima.conversion_demo;

import java.io.*;

/*
    转换流就是来进行字节流和字符流之间转换的桥梁

    InputStreamReader : 是从字节流到字符流的桥梁
        public InputStreamReader(InputStream in) : 创建一个使用默认编码的 InputStreamReader。
        public InputStreamReader(InputStream in ,  String charsetName) : 创建使用指定编码的 InputStreamReader。

    OutputStreamWriter : 是从字符流到字节流的桥梁
        public OutputStreamWriter(OutputStream out) : 创建使用默认字符编码的 OutputStreamWriter
        public OutputStreamWriter(OutputStream out,  String charsetName) : 创建使用指定编码的 OutputStreamWriter。

    需求1 : 使用转换流 , 把以下数据按照GBK的编码写入文件 , 在使用GBK的编码读取数据

    数据如下 :
        远桥之下泛莲舟
        岱岩石上松溪流
        万仞翠山梨亭在
        莫闻空谷声悠悠
 */
public class ConversionDemo1 {
    public static void main(String[] args) throws IOException {
        // 1 创建转换流对象(输入)
        // public InputStreamReader(InputStream in) : 创建一个使用默认编码的 InputStreamReader。
        // InputStreamReader isr = new InputStreamReader(new FileInputStream("day11_demo\\GBKFile.txt"));
        // public InputStreamReader(InputStream in ,  String charsetName) : 创建使用指定编码的 InputStreamReader
        InputStreamReader isr = new InputStreamReader(new FileInputStream("day11_demo\\GBKFile.txt") , "GBK");
        int ch;
        while((ch = isr.read()) != -1){
            System.out.print((char)ch);
        }
        isr.close();
    }

    private static void method() throws IOException {
        // 1 创建转换流对象(输出)   字符流 = 字节流+编码表
        //  public OutputStreamWriter(OutputStream out) : 创建使用默认字符编码的 OutputStreamWriter
        //  public OutputStreamWriter(OutputStream out,  String charsetName) : 创建使用指定编码的 OutputStreamWriter。
        //  OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day11_demo\\GBKFile.txt"));
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day11_demo\\GBKFile.txt"), "GBK");
        osw.write("远桥之下泛莲舟");
        osw.write("\r\n");
        osw.write("岱岩石上松溪流");
        osw.write("\r\n");
        osw.write("万仞翠山梨亭在");
        osw.write("\r\n");
        osw.write("莫闻空谷声悠悠");
        osw.write("\r\n");
        osw.close();
    }
}