package com.atguigu.i_regex;

import java.util.Scanner;

public class Demo01Regex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data = sc.next();
        //boolean result = method(data);
        //System.out.println("result = " + result);

        System.out.println("======================");

        boolean result1 = method02(data);
        System.out.println("result1 = " + result1);
    }

    private static boolean method02(String data) {
        boolean result = data.matches("[1-9][0-9]{4,14}");
        return result;
    }

    private static boolean method(String data) {
        //a.不能0开头
        if (data.startsWith("0")){
            return false;
        }
        //b.必须都是数字
        char[] chars = data.toCharArray();
        for (char aChar : chars) {
            if (aChar<'0' || aChar>'9'){
                return false;
            }
        }
        //c.必须是5-15位
        if (data.length()<5 || data.length()>15){
            return false;
        }
        return true;
    }
}
