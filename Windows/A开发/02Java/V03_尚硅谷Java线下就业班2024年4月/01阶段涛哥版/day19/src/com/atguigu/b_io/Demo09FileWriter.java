package com.atguigu.b_io;

import java.io.FileWriter;
import java.io.IOException;

public class Demo09FileWriter {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("day19_IO\\io\\3.txt");
            fw.write("你好java");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            /*
              fw如果没有new出来,就没必要close了
             */
            if (fw!=null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
