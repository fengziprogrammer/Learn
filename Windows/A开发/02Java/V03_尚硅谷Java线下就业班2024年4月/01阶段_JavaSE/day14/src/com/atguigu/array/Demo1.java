package com.atguigu.array;

import java.util.Arrays;

public class Demo1 {

    /*
    选择排序
        需求
            数组元素{21, 67, 88, 52, 19},请对数组元素进行排序。
            排序后的结果应为:{19,21,52,67,88}
        原理
            从0索引开始，依次和后面元素比较，小的往前放
            第一次完毕，最小值出现在了最小索引处
     */
    public static void main(String[] args) {
        int[] arr = {21, 67, 88, 52, 19,66,33,44};
        sortArr(arr);
        System.out.println(Arrays.toString(arr));
    }

    /*
        选择排序

        分析
            本质:交换
            交换的次数
                ****    首轮次数 arr.length -1
                ***
                **
                *
            交换的内容  前 arr[i]  i 初始值0  后: arr[j] 初始值 j = i + 1
            交换的方式  引入第三方变量
     */
    public static void sortArr(int[] arr){
        for (int i = 0;i< arr.length -1;i++){
            for (int j = 0 + i + 1;j< arr.length -1 -i + i + 1;j++){
                // 交换的内容  前 arr[i]  i 初始值0  后: arr[j] 初始值 j = i + 1
                if(arr[i] > arr[j]){

                    // 交换的方式  引入第三方变量
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }

}
