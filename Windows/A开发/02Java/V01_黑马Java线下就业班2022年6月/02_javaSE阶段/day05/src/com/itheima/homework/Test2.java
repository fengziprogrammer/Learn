package com.itheima.homework;

import java.util.Arrays;

/*
    有以下数组定义：


    int[] arr = {1,332,43,25,3324,34,335,4,45,2,43,52,54};


     要求：

    -  请打印数组所有元素
    -  请对数组元素进行“升序”排序
    -  请对排序后的数组再次打印。
 */
public class Test2 {
    public static void main(String[] args) {
        // 定义数组
        int[] arr = {1,332,43,25,3324,34,335,4,45,2,43,52,54};
        // 把数组转换成一个字符串打印
        System.out.println(Arrays.toString(arr));
        // 对数组进行升序排序
        Arrays.sort(arr);
        // 把数组转换成一个字符串打印
        System.out.println(Arrays.toString(arr));
    }
}
