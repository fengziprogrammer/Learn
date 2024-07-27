package com;
/*
    案例1(数组遍历) -> 经常是其他逻辑基础

    遍历: 将数组中的元素, 一个一个获取到, 做后续操作(打印, 判断, 计算)
        数组长度通过arr.length获取
        最大索引 = arr.length - 1;
 */
public class ArrayDemo02 {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {1, 2, 3, 4, 5};

        //数组长度
        System.out.println("数组长度:" + arr.length); //5

        //遍历数组(打印)
        for (int i = 0; i < arr.length; i++) {
            //i表示目标数组, 所有的索引
            System.out.println(arr[i]);
        }
    }
}
