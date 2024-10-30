package com.atguigu.f_reversestream;

import java.io.FileReader;

public class Demo01InputStreamReader {
    public static void main(String[] args)throws Exception {
        FileReader fr = new FileReader("E:\\Idea\\io\\1.txt");
        int data = fr.read();
        System.out.println((char) data);
        fr.close();
    }
}
