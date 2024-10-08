package com.atguigu.string;

import org.junit.Test;

/*
8、字符串替换
（29）String replace(xx,xx)：不支持正则
（30）String replaceFirst(正则，value)：替换第一个匹配部分
（31）String repalceAll(正则， value)：替换所有匹配部分
 */
public class StringMethod8 {
    @Test
    public void test(){
        String str = "hello244world.java;887";
        //里面的非字母的字符去掉
//        str = str.replaceFirst("[^a-zA-Z]+", "");
//        str = str.replaceAll("[^a-zA-Z]+", "");
        str = str.replace("[^a-zA-Z]+", "");
        System.out.println(str);
    }
    @Test
    public void test01(){
        String str = "尚硅谷是一家靠谱的培训机构";
        //希望 把尚硅谷 替换为 "***"
       str =  str.replace("尚硅谷","***");
        System.out.println(str);
    }
}
