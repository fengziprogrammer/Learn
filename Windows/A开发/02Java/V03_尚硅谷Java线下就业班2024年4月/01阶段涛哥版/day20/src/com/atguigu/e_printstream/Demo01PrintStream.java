package com.atguigu.e_printstream;

import java.io.PrintStream;

public class Demo01PrintStream {
    public static void main(String[] args)throws Exception {
        PrintStream ps = new PrintStream("day20_IO\\io\\print.txt");
        ps.println("白日依山尽");
        ps.println("黄河入海流");
        ps.println("欲穷千里目");
        ps.println("更上一层楼");
        ps.close();
    }
}
