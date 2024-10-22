package com.atguigu.b_io;

import java.io.FileWriter;

public class Demo08FileWriter {
    public static void main(String[] args) throws Exception{
        FileWriter fw = new FileWriter("day19_IO\\io\\3.txt",true);
        fw.write("锄禾日当午\r\n");
        fw.write("汗滴禾下土\n");
        fw.write("谁知盘中餐\n");
        fw.write("粒粒皆辛苦\n");
        fw.flush();
        fw.write("haha");
    }
}
