package com.atguigu.string;

import java.util.Scanner;

public class Homework2 {

    /*
    需求：统计一个字符串中大写字母字符，小写字母字符，数字字符出现的次数,其他字符出现的次数。
        ABCDEabcd123456!@#$%^
        分析
            1> Scanner 获取一个字符串  str
            2> str -> char[] arr
            3> 创建三个计数器
            4> 遍历arr -> arr[i]
                统计: 判断当前元素符合哪个条件 对应的计数器 ++
     */
    public static void main(String[] args) {

        // 1> Scanner 获取一个字符串  str
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串包含大小写字母,数字以及其他字符");
        String str = sc.nextLine();

        // 3> 创建三个计数器
         int countX = 0;// 小写字符计数器
         int countD = 0;// 大写字符计数器
         int countS = 0;// 数字字符计数器
         int countO = 0;// 其他字符计数器
        // 2> str -> char[] arr

        char[] arr = str.toCharArray();

        // 4> 遍历arr -> arr[i]
        for (int i = 0; i < arr.length; i++) {

            // 统计: 判断当前元素符合哪个条件 对应的计数器 ++
            if(arr[i] >= 'a' && arr[i] <= 'z'){
                countX++;
            }else if(arr[i] >= 'A' && arr[i] <= 'Z'){
                countD++;
            }else  if(arr[i] >= '0' && arr[i] <= '9'){
                countS++;
            }
        }

        countO = arr.length - countX - countD - countS;
        System.out.println(countX + "..." + countD + "..."+countS + "..." + countO);

    }
}
