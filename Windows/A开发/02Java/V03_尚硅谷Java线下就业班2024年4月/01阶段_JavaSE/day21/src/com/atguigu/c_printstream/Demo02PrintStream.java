package com.atguigu.c_printstream;

import java.io.PrintStream;

public class Demo02PrintStream {
    public static void main(String[] args)throws Exception {
        PrintStream ps = new PrintStream("day21_IO_Net\\printstream.txt");
        System.setOut(ps);
        System.out.println("蒹葭苍苍");
        System.out.println("白露为霜");
        System.out.println("所谓伊人");
        System.out.println("在水一方");
        ps.close();
    }
}
