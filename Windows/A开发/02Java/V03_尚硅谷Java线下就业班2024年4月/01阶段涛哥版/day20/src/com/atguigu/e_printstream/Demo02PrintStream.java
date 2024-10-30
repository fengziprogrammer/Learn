package com.atguigu.e_printstream;

import java.io.PrintStream;

public class Demo02PrintStream {
    public static void main(String[] args)throws Exception {
        PrintStream ps = new PrintStream("day20_IO\\io\\log.txt");
        System.setOut(ps);
        System.out.println("门前大桥下,游过一群鸭");
        ps.close();
    }
}
