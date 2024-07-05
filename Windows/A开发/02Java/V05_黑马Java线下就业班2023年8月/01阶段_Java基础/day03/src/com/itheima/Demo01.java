package com.itheima;

import java.util.ArrayList;

/*
    案例: for循环案例1(输出数据)
        打印整数1到5
        打印整数5到1

    ++,-- : 自增自减运算符, 只能用于变量不能用于常量
        ++作用: 让变量自己+1
        --作用: 让变量自己-1
 */
public class Demo01 {
    public static void main(String[] args) {
        //需求1: 打印整数1到5
        for(int i = 1; i <= 5; i++){
            System.out.println(i);
        }
        System.out.println("--------------");
        //需求:打印整数5到10
        for(int i = 5; i <= 10; i++){
            System.out.println(i);
        }
        System.out.println("--------------");
        //需求:打印整数5到1
        for (int i = 5; i >= 1 ; i--) {
            System.out.println(i);
        }
        /*
            常见问题:
                1.小括号后面不要写分号! 分号代表一条语句体的结束
                2.如果for循环控制的语句体, 只有一条语句的话, 大括号可以省略, 但是不建议!
         */
    }
}
