package com.atguigu.set;

public class Demo5_String {

    /*
        String 中 的 compareTo()
            返回值 代表两个对象的差值(调用者 - 参数)
                属性值是一致的  长度的差值
                属性值不一致  从第一个不一致的字符起  计算 码表值的差值
     */
    public static void main(String[] args) {

        String s1 = "aa";
        String s2 = "abaadfd";

        System.out.println(s1.compareTo(s2));

    }
}
