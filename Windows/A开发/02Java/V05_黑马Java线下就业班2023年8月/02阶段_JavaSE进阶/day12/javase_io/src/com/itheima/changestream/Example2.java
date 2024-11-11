package com.itheima.changestream;

import java.io.*;

public class Example2 {
    //读GBK编码文件中的数据，向UTF-8编码文件中写入数据
    public static void main(String[] args) throws IOException {
        //创建转换流，读取GBK编码的文件
        InputStreamReader isr = new InputStreamReader(new FileInputStream("f:/files/heima.txt"),"gbk");

        //创建字符输入缓冲流，并把转换流作为参数传递
        BufferedReader br = new BufferedReader( isr );

        //读取一行文本数据
        String line = br.readLine();
        System.out.println("读取到的数据："+line);

        //创建字符输出缓冲流
        BufferedWriter bw = new BufferedWriter(new FileWriter("files/heima.txt"));//默认编码：UTF-8
        bw.write(line);

        //释放资源
        isr.close();
        br.close();
        bw.close();
    }
}
