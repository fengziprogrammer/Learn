package com.atguigu.a_exception;

import java.io.FileNotFoundException;

public class Demo03Exception {
    public static void main(String[] args) {
        String s = "abc.txt";
        method(s);
    }

    public static void method(String s) {
        if (!s.endsWith(".txt")){
          //创建异常对象
            throw new NullPointerException();
        }
    }
}
