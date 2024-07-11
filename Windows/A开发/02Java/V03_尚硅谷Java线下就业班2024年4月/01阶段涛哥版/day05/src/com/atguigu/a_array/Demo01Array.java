package com.atguigu.a_array;

import java.util.Random;

public class Demo01Array {
    public static void main(String[] args) {
        //1.创建Random对象以及数组
        Random rd = new Random();
        int[] arr = new int[10];
        //2.定义一个变量,统计个数 count
        int count = 0;
        //3.循环随机循环存
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(101);
        }
        //4.遍历数组,将每一个元素获取出来

        for (int i = 0; i < arr.length; i++) {
        //5.判断如果 元素%3==0 && 元素%5==0 && 元素%7!=0
            if (arr[i]%3==0 && arr[i]%5==0 && arr[i]%7!=0){
        //6.如果判断成功,count++
               count++;
            }
        }
        //7.输出count
        System.out.println("count = " + count);
    }
}
