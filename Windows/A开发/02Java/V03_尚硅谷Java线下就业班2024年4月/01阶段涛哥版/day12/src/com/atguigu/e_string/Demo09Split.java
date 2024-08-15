package com.atguigu.e_string;

public class Demo09Split {
    public static void main(String[] args) {
        //String[] split(String regex):按照指定规则分割字符串,返回String数组
        String s = "java,text";
        String[] arr = s.split(",");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("========================");
        String s1 = "java.text";
        String[] arr1 = s1.split("\\.");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
