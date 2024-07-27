package com;

import java.util.Random;

/*
    案例3(元素打乱)

        前置知识:
            数据交换 -> 借助第三方临时变量
            Random -> 大家都会
 */
public class ArrayDemo04 {
    public static void main(String[] args) {
        //随机数对象
        Random r = new Random();
        //定义数组
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            //生成一个随机索引, 范围是[0-数组长度), 本质上就是取索引的范围!
            int index = r.nextInt(arr.length);
            //用当前元素和索引索引指向的元素, 进行交换
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void method() {
        //定义变量
        int a = 10;
        int b = 20;
        //数据交换,借助第三方临时变量
        int temp = a;
        a = b;
        b = temp;
        //打印结果
        System.out.println("a:" + a);
        System.out.println("b:" + b);
    }
}
