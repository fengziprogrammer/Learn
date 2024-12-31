package io;

import java.io.*;

/**
 * java.io.BufferedReader缓冲字符输入流
 * 块读文本数据，并且可以按行读取字符串
 */
public class BRDemo {
    public static void main(String[] args) throws IOException {
        //将当前原代码读取出来并输出到控制台
        FileInputStream fis= new FileInputStream(
            "./src/main/java/io/BRDemo.java"
        );
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String line;
        /*
            String readLine()
            读取一行字符串并返回。返回的字符串中不含有这一行最后的换行符。
            若某一行是空行(只有一个换行符，比如当前原代码中第二行)则返回
            一个空字符串。
            当返回值为null时，表示流读取到了末尾。
            注:缓冲字符流第一次调用readLine时并非只读取了第一行内容，而是
            一次性读取若干字符并存入内部的缓冲区(块读)，然后仅将第一行内容
            进行返回而已，再次调用则返回第二行内容。以此类推。
         */
        while((line = br.readLine())!=null){
            System.out.println(line);
        }

        br.close();

    }
}
