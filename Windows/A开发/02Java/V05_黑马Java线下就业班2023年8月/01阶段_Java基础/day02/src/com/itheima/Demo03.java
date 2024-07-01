package com.itheima;

/*
    案例: 字符相加
        当字符参与运算,底层会使用该字符,在ASCII码表中对应的十进制的整数值运算

    A -> 65  A到Z是连续的,逐个+1
    a -> 97  a到z是连续的,逐个+1
    0 -> 48  0到9是连续的,逐个+1
 */
public class Demo03 {
    public static void main(String[] args) {
        //单独打印,展示的是字符本身
        System.out.println('0'); //0
        System.out.println('A'); //A
        System.out.println('a'); //a

        //参与运算,展示的是字符在ASCII码表中对应的整数相加的结果
        System.out.println('0' + 1); //49
        System.out.println('A' + 1); //66
        System.out.println('a' + 1); //98
    }
}
