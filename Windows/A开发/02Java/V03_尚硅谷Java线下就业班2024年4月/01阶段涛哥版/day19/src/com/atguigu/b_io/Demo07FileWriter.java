package com.atguigu.b_io;

import java.io.FileWriter;

public class Demo07FileWriter {
    public static void main(String[] args) throws Exception{
        FileWriter fw = new FileWriter("day19_IO\\io\\3.txt",true);
        fw.write("鹅鹅鹅\r\n");
        fw.write("曲项向天歌\n");
        fw.write("白毛浮绿水\n");
        fw.write("红掌拨清波\n");
        fw.flush();
    }
}
