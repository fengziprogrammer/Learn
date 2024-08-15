package com.atguigu.e_string;

import java.io.UnsupportedEncodingException;

public class Demo07Replace {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s1 = "abcdefg";
        //char[] toCharArray()  ->  将字符串转成char数组
        char[] chars = s1.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        //byte[] getBytes()  -> 使用默认字符集,将字符串转成字节数组
        byte[] bytes = "abcdefg".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("==================================");
        byte[] bytes1 = "你".getBytes();
        for (int i = 0; i < bytes1.length; i++) {
            System.out.println(bytes1[i]);
        }
        /*String replace(CharSequence target, CharSequence replacement)
                ->将与target匹配的字符串使用replacement字符串替换*/

        String s2 = "abdefeaeazzzafeaf";
        String replace = s2.replace("z", "y");
        System.out.println("replace = " + replace);

        System.out.println("===========================");
        /*
           byte[] getBytes(String charsetName)->按照指定的编码表将字符串转成byte数组
         */
        byte[] bytes2 = "你".getBytes("GBK");
        for (int i = 0; i < bytes2.length; i++) {
            System.out.println(bytes2[i]);
        }
    }
}
