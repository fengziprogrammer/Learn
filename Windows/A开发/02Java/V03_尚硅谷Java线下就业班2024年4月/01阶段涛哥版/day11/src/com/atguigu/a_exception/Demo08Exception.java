package com.atguigu.a_exception;

import java.io.FileNotFoundException;

public class Demo08Exception {
    public static void main(String[] args) {
        String s = "abc.txt1";
        try {
            String s1 = null;
            System.out.println(s1.length());//NullPointerException
            method(s);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            System.out.println("我一定要执行,爱谁谁!");
        }
    }
    public static void method(String s)throws FileNotFoundException{
        if (!s.endsWith(".txt")){
            throw new FileNotFoundException("文件找不到异常");
        }
    }
}
