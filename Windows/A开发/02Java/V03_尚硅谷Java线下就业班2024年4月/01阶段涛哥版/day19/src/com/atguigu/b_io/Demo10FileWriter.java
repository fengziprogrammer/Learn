package com.atguigu.b_io;

import java.io.FileWriter;
import java.io.IOException;

public class Demo10FileWriter {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("day19_IO\\io\\3.txt");) {
            fw.write("你好java");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
