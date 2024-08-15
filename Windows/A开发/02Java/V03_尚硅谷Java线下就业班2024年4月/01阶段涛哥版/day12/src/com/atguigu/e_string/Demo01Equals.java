package com.atguigu.e_string;

public class Demo01Equals {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("ABC");
        //boolean equals(Object anObject) -> 比较两个字符串的内容
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//false
        //boolean equalsIgnoreCase(String anotherString)-> 比较两个字符串的内容,忽略大小写
        System.out.println(s1.equalsIgnoreCase(s3));
    }
}
