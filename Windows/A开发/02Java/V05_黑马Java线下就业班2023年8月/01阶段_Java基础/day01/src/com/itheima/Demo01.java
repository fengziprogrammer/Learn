package com.itheima;

/*
    字面量(常量): 程序运行过程中其值不会发生改变的量
        1.整数常量
        2.小数常量
        3.字符常量
        4.字符串常量
        5.布尔常量
 */
public class Demo01 {
    public static void main(String[] args) {
        //1.整数常量
        System.out.println(10);
        System.out.println(-100);

        //2.小数常量
        System.out.println(3.0);
        System.out.println(5.5);

        //3.字符常量: 单引号引起来的单个内容, 可以是键盘上敲出来的任意东西
        System.out.println('0');
        System.out.println('A');
        System.out.println('哈');
        System.out.println(' ');

        //4.字符串常量: 双引号引起来的任意内容
        System.out.println("HelloWorld");
        System.out.println("嘿嘿 ABC qwer #@%");

        //5.布尔常量: 只有true(真)和false(假) -> 判断条件的结果
        //System.out.println(true);
        //System.out.println(false);
        System.out.println(10 > 5); //true
        System.out.println(11 == 10); //false
    }
}
