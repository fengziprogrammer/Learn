package com.itheima.objects;

import java.util.Objects;

public class ObjectsTest {
    public static void main(String[] args) {
        String str1 = null;

        String str2 = "itcast";

        //使用Objects工具类中的API方法： 比较两个字符串是否相同
        boolean result2 = Objects.equals(str1,str2);
        System.out.println(result2);

        //使用Strig类中的API方法： 比较两个字符串是否相同
        boolean result1 = str1.equals(str2);
        System.out.println(result1);
    }
}
