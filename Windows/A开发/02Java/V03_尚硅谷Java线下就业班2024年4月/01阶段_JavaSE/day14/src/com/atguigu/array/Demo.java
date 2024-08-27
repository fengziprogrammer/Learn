package com.atguigu.array;

import java.util.Arrays;

public class Demo {

    /*
    冒泡排序
        需求
            将一个数组进行排序 (默认的正序)
        原理
            相邻的两个元素,两两做比较,小的在前,大的在后
        总结
            本质: 做交换
            交换的次数
                长度: 5
                ****    首轮比较的次数是arr.length-1
                ***
                **
                *
             交换的条件
                  前 > 后    前 arr[j]   后arr[j + 1]
             交换的方式
                引入第三方变量

     */
    public static void main(String[] args) {

        int[] arr = {11,55,44,22,66};

        sort(arr);

        System.out.println(Arrays.toString(arr));
    }


    /*
    需求
            将一个数组进行排序 (默认的正序)
            返回值类型  void
            参数列表     int[] arr
     */
    public static void sort(int[] arr){

        // 本质: 做交换
        //交换的次数
        for(int i = 0;i <  arr.length -1;i++){//决定比较多少轮
            for (int j = 0;j< arr.length -1 - i;j++){//决定了每轮比较多少次

                // 交换的条件  前 > 后    前 arr[j]   后arr[j + 1]
                if(arr[j] > arr[j + 1]){

                    // 交换的方式 引入第三方变量
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }

        }

    }
}
