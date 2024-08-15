package com.atguigu.e_string;

import java.util.Objects;

public class Demo04Equals {
    public static void main(String[] args) {
        String s = null;
        method(s);
    }

    private static void method(String s) {
       if (Objects.equals(s,"root")){
           System.out.println("字符串内容都是root");
       }else{
           System.out.println("字符串内容不都是root");
       }
    }
}
