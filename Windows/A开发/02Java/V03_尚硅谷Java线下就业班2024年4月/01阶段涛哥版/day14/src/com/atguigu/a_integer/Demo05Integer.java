package com.atguigu.a_integer;

public class Demo05Integer {
    public static void main(String[] args) {
        Integer i1 = 100;
        Integer i2 = 100;
        System.out.println(i1==i2);//true

        Integer i3 = 127;
        Integer i4 = 127;
        System.out.println(i3==i4);//true

        Integer i5 = 128;
        Integer i6 = 128;
        System.out.println(i5==i6);//false
    }
}
