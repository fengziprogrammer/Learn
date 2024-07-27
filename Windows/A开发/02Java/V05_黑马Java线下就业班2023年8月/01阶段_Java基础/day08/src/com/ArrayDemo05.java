package com;

import java.util.Scanner;

/*
    数组初始化引用场景
        静态: 指定元素, 推荐使用简化格式
        动态: 指定长度, 不知道具体元素的情况使用

    案例(数组的动态初始化):
        创建一个合适的数组, 用来存储键盘录入的5个整数
        遍历数组, 打印每一个元素
 */
public class ArrayDemo05 {
    public static void main(String[] args) {
        //由于不知道具体元素, 使用动态初始化数组, 数组长度为5
        int[] arr = new int[5]; //0 0 0 0 0

        //创建键盘对象
        Scanner sc = new Scanner(System.in);

        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            //提示录入, 将接收的整数, 赋值到数组中
            System.out.println("请输入第" + (i + 1) + "个元素:");
            arr[i] = sc.nextInt();
        }

        System.out.println("---------------------");

        //遍历数组, 查看赋值后的元素
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
