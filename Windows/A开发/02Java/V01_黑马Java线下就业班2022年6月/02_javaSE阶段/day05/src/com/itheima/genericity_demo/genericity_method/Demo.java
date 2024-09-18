package com.itheima.genericity_demo.genericity_method;

import java.util.ArrayList;
import java.util.Arrays;

/*
    需求 : 定义存储字符串的ArrayList集合，将字符串的集合转换为字符串数组
 */
public class Demo {
    public static void main(String[] args) {
        // getMax("a" , "b");
        // getMax(10 , 20);
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("asd");
        list.add("qwe");

        // 将字符串的集合转换为字符串数组
        // <T> T[] toArray(T[] a)
        String[] str = new String[list.size()];
        String[] strings = list.toArray(str);
        System.out.println(Arrays.toString(strings));// [abc, asd, qwe]
    }

    public static <T> void getMax(T a, T b) {
       if(a instanceof String){
           System.out.println("泛型为String类型");
       }
       if(a instanceof Integer){
           System.out.println("泛型为Integer类型");
       }
    }

//    public static int getMax(int a, int b) {
//        return a > b ? a : b;
//    }
//
//    public static byte getMax(byte a, byte b) {
//        return a > b ? a : b;
//    }
//
//    public static long getMax(long a, long b) {
//        return a > b ? a : b;
//    }
}
