package com.atguigu.e_string;

public class Demo05Get {
    public static void main(String[] args) {
        String s1 = "abcdefga";
        //public int length():返回 此字符串的长度
        System.out.println(s1.length());
        //public String concat(String str):将指定的字符串拼接到老串的末尾
        String newStr = s1.concat("hahahaha");
        System.out.println("newStr = " + newStr);
        System.out.println("s1 = " + s1);
        //char charAt(int index)  :返回指定索引处的char值
        System.out.println(s1.charAt(1));
        //int indexOf(String str)  :获取的是指定字符串在老串中第一次出现的索引位置
        System.out.println(s1.indexOf("a"));
        //String substring(int beginIndex):返回一个子字符串,从beginIndex开始截取字符串到字符串末尾,老串不动
        String newStr1 = s1.substring(4);
        System.out.println("newStr1 = " + newStr1);
        //String substring(int beginIndex, int endIndex) :返回一个子字符串,从beginIndex到endIndex截取字符串,  含beginIndex,不含endIndex
        String newStr2 = s1.substring(1, 5);
        System.out.println("newStr2 = " + newStr2);
    }
}
