package com.atguigu.e_printstream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class Demo03PrintStream {
    public static void main(String[] args)throws Exception {
        PrintStream ps = new PrintStream(new FileOutputStream("day20_IO\\io\\printstream.txt",true));
        ps.println("火大了火大了,饺子破了");
        ps.println("饺子破没法吃怎么办呀?");
        ps.println("皮儿在外馅儿在内那是饺子");
        ps.println("皮儿在内馅儿在外那是披萨");
        ps.close();
    }
}
