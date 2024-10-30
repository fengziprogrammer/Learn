package com.atguigu.d_filewriter;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Demo01FileWriter {
    public static void main(String[] args)throws Exception {
        //method01();
        method02();
    }

    private static void method02() throws Exception{
        FileWriter fw = new FileWriter("day20_IO\\4.txt",true);
        fw.write("键盘敲烂\n");
        fw.write("月薪过万\n");
        //fw.flush();
        fw.close();
    }

    private static void method01() throws IOException {
        FileWriter fw = new FileWriter("day20_IO\\4.txt");
        fw.write("键盘敲烂");
        fw.write("月薪过万");
        //fw.flush();
        fw.close();
    }
}
