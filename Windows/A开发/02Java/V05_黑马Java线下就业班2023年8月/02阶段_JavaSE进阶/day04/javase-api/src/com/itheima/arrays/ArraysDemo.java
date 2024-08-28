package com.itheima.arrays;

import java.util.Arrays;
import java.util.Random;

public class ArraysDemo {
    //需求：随机生成10个[0,100]之间的整数，放到整数数组中，按照从小到大的顺序排序并打印元素内容
    public static void main(String[] args) {
        //解决需求1： 定义数组，存储10个随机整数
        int[] array = new int[10];

        //创建随机数字对象
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            int num = r.nextInt(101);
            array[i] = num;
        }
        //测试看看数组中的元素值
        System.out.println(Arrays.toString(array));//把数组转换为字符串

        //解决需求2： 对数组中的元素进行排序
        Arrays.sort(array);


        //打印数组中元素的格式： 元素1  元素2
        String str = Arrays.toString(array);//str="[2, 3, 5, 7, 27, 31, 52, 54, 76, 76]";
        str = str.substring(1, str.length()-1 );//去除前后：中括号
        str = str.replaceAll(",", " ");

        System.out.println("排序后：" + str);
    }
}
