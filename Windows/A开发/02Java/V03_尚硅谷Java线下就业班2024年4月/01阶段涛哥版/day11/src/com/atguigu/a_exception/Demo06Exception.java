package com.atguigu.a_exception;

import java.io.FileNotFoundException;

public class Demo06Exception {
    public static void main(String[] args) {
        String s = "abc.txt1";
        try {
            //String s1 = null;
            //System.out.println(s1.length());//NullPointerException
            add(s);
        }catch (FileNotFoundException e){
            //如果try中的异常抓不到,try...catch外面的功能会受影响

            e.printStackTrace();//将异常详细信息打印出来
        }
        System.out.println("删除功能");
        System.out.println("修改功能");
        System.out.println("查询功能");

        try {
            add(s);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static void add(String s) throws FileNotFoundException {
        if (!s.endsWith(".txt")) {
            throw new FileNotFoundException("文件找不到");
        }
        System.out.println("我要执行");
    }
}
