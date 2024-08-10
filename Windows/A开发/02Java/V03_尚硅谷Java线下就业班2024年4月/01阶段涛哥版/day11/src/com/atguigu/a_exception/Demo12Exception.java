package com.atguigu.a_exception;

import java.io.FileNotFoundException;

public class Demo12Exception {
    public static void main(String[] args) {
        String s = "abc.txt1";
        try {
            method(s);
        } catch (FileNotFoundException e) {
            //System.out.println(e.getMessage());
            //System.out.println(e.toString());
            e.printStackTrace();
        }
    }
    public static void method(String s)throws FileNotFoundException{
        if (!s.endsWith(".txt")){
            throw new FileNotFoundException("文件找不到异常");
        }
    }
}
