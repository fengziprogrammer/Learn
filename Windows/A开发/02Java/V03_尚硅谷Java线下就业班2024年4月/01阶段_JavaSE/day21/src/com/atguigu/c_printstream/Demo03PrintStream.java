package com.atguigu.c_printstream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class Demo03PrintStream {
    public static void main(String[] args)throws Exception {
        PrintStream ps = new PrintStream(new FileOutputStream("day21_IO_Net\\printstream.txt",true));
        ps.println("离离原上草");
        ps.println("一岁一枯荣");
        ps.println("野火烧不尽");
        ps.println("春风吹又生");
        ps.close();
    }
}
