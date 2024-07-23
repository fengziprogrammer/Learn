package com;
/*
    学习Integer目的, 是完成String和int之间的转换

        int -> String
            方式1: 空串+号拼接
            方式2: static String valueOf(int i);

        String -> int
            static int parseInt(String s);
 */
public class IntegerDemo02 {
    public static void main(String[] args) {
        /*
            int -> String
         */
        //方式1: 空串+号拼接
        int i = 100;
        String s = i + "";
        System.out.println(s);

        //方式2: static String valueOf(int i);
        String ss = String.valueOf(100);
        System.out.println(ss);

        /*
            String -> int
         */
        //static int parseInt(String s);
        int num = Integer.parseInt("888");
        System.out.println(num); //888
    }
}
