package com.itheima.conversion_demo;

import java.io.*;
import java.nio.charset.Charset;

/*
    OutputStreamWriter类和File类的关系

    public class FileWriter extends OutputStreamWriter : 属于子父类关系

    OutputStreamWriter类
        优点 : 可以自己指定编码
        缺点 : 使用过于复杂

    FileWriter类
        优点 : 操作简单
        缺点 : 不能指定编码(使用默认编码) , 如果指定编码 , 需要使用JDK版本需要大于等于11
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("路径") , "UTF-8");
        FileWriter fw = new FileWriter("路径");

        FileWriter fw2 = new FileWriter("路径" , Charset.forName("GBK"));
    }
}
