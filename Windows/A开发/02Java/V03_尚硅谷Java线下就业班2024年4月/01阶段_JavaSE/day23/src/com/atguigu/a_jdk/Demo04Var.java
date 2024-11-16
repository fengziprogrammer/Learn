package com.atguigu.a_jdk;

public class Demo04Var {
    public static void main(String[] args) {
        //String s = "abc";
        //int i = 10;
        var i = 10;
        var s = "abc";

        var arr = new int[]{1,2,3,4,5};
        for (var element : arr) {
            System.out.println(element);
        }

    }
}
