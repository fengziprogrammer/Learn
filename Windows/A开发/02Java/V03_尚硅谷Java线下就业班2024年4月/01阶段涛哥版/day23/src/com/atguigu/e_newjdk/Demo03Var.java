package com.atguigu.e_newjdk;

public class Demo03Var {
    public static void main(String[] args) {
        var i = 10;
        System.out.println("i = " + i);

        var j = "helloworld";
        System.out.println("j = " + j);

        var arr = new int[]{1,2,3,4};

        for (var element : arr) {
            System.out.println(element);
        }
    }
}
