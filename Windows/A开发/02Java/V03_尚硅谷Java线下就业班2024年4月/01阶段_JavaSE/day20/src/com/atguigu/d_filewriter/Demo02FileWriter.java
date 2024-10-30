package com.atguigu.d_filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class Demo02FileWriter {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("day20_IO\\4.txt");
            fw.write("床前鞋两双");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
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
