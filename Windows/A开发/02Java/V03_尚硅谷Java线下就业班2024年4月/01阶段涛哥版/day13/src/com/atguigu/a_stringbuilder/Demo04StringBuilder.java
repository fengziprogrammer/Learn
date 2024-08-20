package com.atguigu.a_stringbuilder;

public class Demo04StringBuilder {
    public static void main(String[] args) {
        //method();
        method02();
    }

    private static void method02() {
        long start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sb.append("hahaah");
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

    private static void method() {
        long start = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < 10000; i++) {
            str+="hahaha";
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
