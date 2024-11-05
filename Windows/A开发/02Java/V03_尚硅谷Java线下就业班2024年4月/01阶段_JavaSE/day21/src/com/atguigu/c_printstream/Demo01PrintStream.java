package com.atguigu.c_printstream;

import java.io.PrintStream;

public class Demo01PrintStream {
    public static void main(String[] args)throws Exception {
        PrintStream ps = new PrintStream("day21_IO_Net\\printstream.txt");
        ps.println("离离原上草");
        ps.println("一岁一枯荣");
        ps.println("野火烧不尽");
        ps.println("春风吹又生");
        ps.close();
    }
}
