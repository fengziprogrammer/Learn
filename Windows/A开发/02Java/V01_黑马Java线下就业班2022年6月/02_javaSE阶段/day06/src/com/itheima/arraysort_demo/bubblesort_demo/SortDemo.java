package com.itheima.arraysort_demo.bubblesort_demo;

import java.util.Arrays;

/*
    冒泡排序 : 将一组数据按照从小到大的顺序进行排序
    冒泡排序的原理 : 相邻元素两两作比较 , 大的元素往后放

    注意 :
        1 如果有n个数据进行排序，总共需要比较n-1次
        2 每一次比较完毕，下一次的比较就会少一个数据参与

    需求 : 将数组中的元素 {3,5,2,1,4} 进行升序排序
 */
public class SortDemo {
    public static void main(String[] args) {
        int[] arr = {33, 22, 44, 55, 11};

        for (int x = 0; x < arr.length - 1; x++) { // 控制比较的轮次
            for (int i = 0; i < arr.length - 1 - x; i++) { // 每轮相邻元素比较的次数
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));

//        // 第一轮比较
//        // -1 : 防止索引越界
//        for (int i = 0; i < arr.length - 1 - 0; i++) {
//            if (arr[i] > arr[i + 1]) {
//                int temp = arr[i];
//                arr[i] = arr[i + 1];
//                arr[i + 1] = temp;
//            }
//        }
//
//        System.out.println(Arrays.toString(arr));
//
//
//        // 第一轮比较
//        // -1 : 防止索引越界
//        // -1 : 第二轮比较减少一个元素参与
//        for (int i = 0; i < arr.length - 1 - 1; i++) {
//            if (arr[i] > arr[i + 1]) {
//                int temp = arr[i];
//                arr[i] = arr[i + 1];
//                arr[i + 1] = temp;
//            }
//        }
//
//        System.out.println(Arrays.toString(arr));
//
//        // 第三轮比较
//        // -1 : 防止索引越界
//        // -2 : 第三轮比较减少两个元素参与
//        for (int i = 0; i < arr.length - 1 - 2; i++) {
//            if (arr[i] > arr[i + 1]) {
//                int temp = arr[i];
//                arr[i] = arr[i + 1];
//                arr[i + 1] = temp;
//            }
//        }
//
//        System.out.println(Arrays.toString(arr));
//
//
//        // 第四轮比较
//        // -1 : 防止索引越界
//        // -2 : 第四轮比较减少三个元素参与
//        for (int i = 0; i < arr.length - 1 - 3; i++) {
//            if (arr[i] > arr[i + 1]) {
//                int temp = arr[i];
//                arr[i] = arr[i + 1];
//                arr[i + 1] = temp;
//            }
//        }
//
//        System.out.println(Arrays.toString(arr));
    }
}
