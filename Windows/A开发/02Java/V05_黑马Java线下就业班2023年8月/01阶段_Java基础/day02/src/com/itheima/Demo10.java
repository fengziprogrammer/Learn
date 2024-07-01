package com.itheima;

/*
    需求: 根据键盘录入的age, 判断这个人在哪一个范围
        [0-17] 未成年人
        [18-65] 青年人
        [66-79] 中年人
        [80-99] 老年人
        100+ 长寿老人

    键盘对象 Scanner
        1. 导包 import java.util.Scanner; //idea自动导包的,不需要写
        2. 创建对象 Scanner sc = new Scanner(System.in);
        3. 调用方法,接收数据 int num = sc.nextInt();
 */

import java.util.Scanner;

public class Demo10 {
    public static void main(String[] args) {
        //创建键盘对象
        Scanner sc = new Scanner(System.in);
        //控制提提示输入年龄
        System.out.println("请输入一个年龄:");
        int age = sc.nextInt();

        //由于有多个条件,选择if的格式3
        if (age <= 17 && age >= 0) {
            System.out.println("未成年人");
        } else if (age <= 65 && age >= 18) {
            System.out.println("青年人");
        } else if (age <= 79 && age >= 66) {
            System.out.println("中年人");
        } else if (age <= 99 && age >= 80) {
            System.out.println("老年人");
        } else if (age >= 100) {
            System.out.println("长寿老人");
        } else {
            System.out.println("你输入的年龄错误!");
        }
    }
}
