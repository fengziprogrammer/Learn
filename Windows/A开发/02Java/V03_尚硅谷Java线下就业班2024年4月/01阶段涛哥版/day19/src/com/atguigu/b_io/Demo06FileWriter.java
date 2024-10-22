package com.atguigu.b_io;

import java.io.FileOutputStream;
import java.io.FileWriter;

public class Demo06FileWriter {
    public static void main(String[] args) throws Exception{
        FileWriter fw = new FileWriter("day19_IO\\io\\3.txt");
        fw.write("李白乘舟将欲行\r\n");
        fw.write("忽闻岸上踏歌声\n");
        fw.write("桃花潭水深千尺\n");
        fw.write("不及汪伦送我情\n");
        fw.flush();
    }
}
