package com.itheima.arraysort_demo.selectionsort_demo;

import java.util.Arrays;

/*
    选择排序工作原理 :
        它的工作原理是每一次从待排序的数据元素中选出最小的一个元素，
        存放在序列的起始位置，然后，再从剩余未排序元素中继续寻找最小元素，然后放到已排序序列的末尾。
        以此类推，直到全部待排序的数据元素排完。

    注意 :
        1 有n个元素，那么就要比较n-1趟。
        2 每一趟中都会选出一个最值元素，较前一趟少比较一次
 */
public class SortDemo {
    public static void main(String[] args) {
        int[] arr = {33, 22, 44, 55, 11}; // { 11 , 22, 33 , 44 , 55  }

        for (int i = 0; i < arr.length - 1; i++) {
            // minIndex记录的是待排序中最小值的索引
            int minIndex = i;
            // 作为当前轮次的参照物 , 记录当前轮次的最小值
            int min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }

            if (i != minIndex) {
                // 让当前轮次的最小值和i的位置做交换
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
