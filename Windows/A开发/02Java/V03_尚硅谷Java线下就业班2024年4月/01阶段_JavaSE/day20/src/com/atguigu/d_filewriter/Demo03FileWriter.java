package com.atguigu.d_filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class Demo03FileWriter {
    public static void main(String[] args) {
        try(FileWriter fw = new FileWriter("day20_IO\\4.txt")){
           fw.write("不光是床前鞋两双,床上还有三个人");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
