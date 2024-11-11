package com.itheima.charstream.demo2;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo1 {
    //演示：FileWriter类的基本使用
    public static void main(String[] args) throws IOException {
        //创建对象
        FileWriter fw = new FileWriter("files/hello.txt");//覆盖写入

        //写入字符数据
        fw.write('黑');
        fw.write('马');

        fw.write("程序员");//写入字符串
        fw.write("\r\n");//写入换行符号

        fw.write("程序员", 0 , 2);//把字符串中的部分数据写入到文件

        fw.write("\r\n");
        char[] chs = {'上','海'};
        fw.write(chs);

        fw.write("\r\n");
        fw.write(chs,1,1);

        //释放资源
        fw.close();
    }
}
