package com.atguigu.string;

import org.junit.Test;

/*
2、字符串的查找相关，系列2
（11）boolean contains(xx)：是否包含xx
（12）int indexOf(xx)：从前往后找当前字符串中xx，即如果有返回第一次出现的下标，要是没有返回-1
（13）int lastIndexOf(xx)：从后往前找当前字符串中xx，即如果有返回最后一次出现的下标，要是没有返回-1
 */
public class StringMethod2 {
    @Test
    public void test03(){
        String str = "hellojavaworld";
        //看里面是否有“o”，如果有，返回位置
        System.out.println(str.indexOf("o"));
        System.out.println(str.lastIndexOf("o"));
        System.out.println(str.lastIndexOf("t"));
    }
    @Test
    public void test02(){
        String str = "helloworld";
        System.out.println(str.contains("hallo"));
    }

    @Test
    public void test01(){
        String str = "hello";
        System.out.println(str.contains("o"));
    }
}
