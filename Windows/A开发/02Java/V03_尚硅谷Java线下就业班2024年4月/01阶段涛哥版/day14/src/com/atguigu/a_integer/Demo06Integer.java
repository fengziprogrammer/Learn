package com.atguigu.a_integer;

public class Demo06Integer {
    public static void main(String[] args) {
        //基本类型转成String
        int i = 10;
        String s1 = i+"";
        System.out.println(s1+1);

        System.out.println("==========");
        String s2 = String.valueOf(10);
        System.out.println(s2+1);
    }
}
