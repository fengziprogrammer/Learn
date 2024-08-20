package com.atguigu.string;

import java.util.Arrays;

public class Demo3 {

    /*
    boolean matchs(正则表达式)：判断当前字符串是否匹配某个正则表达式。
    String[] split(正则表达式)：按照某种规则进行拆分
    public String replaceAll(String regex,String replacement),按照正则表达式进行替换


    String ,StringBuilder 与StringBuffer区别
        1> String 是不可变字符序列
        2> 其余两个 是可变字符序列
            StringBuffer  1.0  线程同步的 安全  效率低
            StringBuilder 1.5  线程不同步  不安全 效率高

     */
    public static void main(String[] args) {

        String regex = "\\d";
        System.out.println("".matches(regex));
        System.out.println("a".matches(regex));
        System.out.println("1".matches(regex));
        System.out.println("-----------------");

        String s = "张三.李四.王五";
        String[] arr = s.split("\\.");
        for (String s1 : arr) {
            System.out.println(s1);
        }

        String s2 = "dfg4kdjg4aefjs6oa8";
        String s3 = s2.replaceAll("\\d", "");
        System.out.println(s3);


    }
}
