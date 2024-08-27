package com.atguigu.a_integer;

public class Demo04Integer {
    public static void main(String[] args) {
        Integer i = 1;//装箱 Integer.valueOf
        i+=1;//先拆箱(intValue),做运算,将结果装箱(Integer,valueOf)
        System.out.println(i);
    }
}
