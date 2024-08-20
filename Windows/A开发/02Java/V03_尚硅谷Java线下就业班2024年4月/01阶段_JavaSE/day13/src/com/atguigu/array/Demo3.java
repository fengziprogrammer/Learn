package com.atguigu.array;

public class Demo3 {

    /*
    冒泡排序
    数组元素{21, 67, 88, 52, 19},请对数组元素进行排序。
    排序后的结果应为:{19,21,52,67,88}

    原理
        相邻的两个元素 ,两两做比较,小的在前,大的在后
     */
    public static void main(String[] args) {
        int[] arr = {21, 67, 88, 52, 19,66,33,22};
        sortArr(arr);
        System.out.println("排序后的数组元素为:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }


    /*
    冒泡排序
    数组元素{21, 67, 88, 52, 19},请对数组元素进行排序。
    排序后的结果应为:{19,21,52,67,88}
    参数列表
        int[] arr
    返回值类型  void
        本质  交换
            交换次数
                ****    首轮比较的次数 = arr,length -1
                ***
                **
                *
            交换内容
                前 arr[j] j 的初始值 0
                后 arr[j + 1]
             交换的条件
                前 > 后
             交换的方式
                引入第三方变量
     */
    public static void sortArr(int[] arr){

        // 交换次数
        for (int i = 0;i < arr.length -1;i++){
            for (int j = 0;j < arr.length -1 - i;j++){

                // 交换内容    前 arr[j] j 的初始值 0   后 arr[j + 1]
                // 交换的条件  前 > 后
                if(arr[j] > arr[j+1]){
                    // 交换的方式 引入第三方变量
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }

        }


    }
}
