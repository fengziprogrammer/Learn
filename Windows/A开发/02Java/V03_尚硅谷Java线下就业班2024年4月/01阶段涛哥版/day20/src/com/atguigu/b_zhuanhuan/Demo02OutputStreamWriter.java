package com.atguigu.b_zhuanhuan;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Demo02OutputStreamWriter {
    public static void main(String[] args)throws Exception {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("E:\\Idea\\io\\upload\\2.txt"),"GBK");
        osw.write("你");
        osw.close();
    }
}
