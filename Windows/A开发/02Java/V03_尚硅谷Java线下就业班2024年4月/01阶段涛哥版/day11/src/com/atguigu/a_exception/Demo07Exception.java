package com.atguigu.a_exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo07Exception {
    public static void main(String[] args) {
        String s = "abc.txt1";
        /*try {
            add(s);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }*/

        //错误演示
        /*try {
            add(s);
        }catch (IOException e){
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/

        /*try {
            add(s);
        }catch (IOException e){
            e.printStackTrace();
        }*/

        try {
            add(s);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void add(String s) throws FileNotFoundException, IOException {
        if (s == null) {
            //创建异常对象
            throw new IOException("IO异常了");
        }

        if (!s.endsWith(".txt")) {
            //创建异常对象
            throw new FileNotFoundException("文件找不到异常");//利用有参构造设置异常信息
        }

        System.out.println("我要执行");
    }
}
