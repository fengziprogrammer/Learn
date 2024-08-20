package com.atguigu.array;

public class Demo2 {

    /*
    查找指定元素第一次在数组中出现的索引
        int[] arr = {1,2,3,4,5,6,7};
        int[] arr = {11,22,33,44,55,66,77};


        二分查找法  前提 : 要求数组是有序 小-> 大
            结论
                索引小的元素 一定 小于 索引大的元素
            原理
                默认猜元素就是所有元素区间[0,length-1]中的二分值
            猜测的区间
                min = 0;
                max = length-1;
                mid = (min + max) /2;
     */
    public static void main(String[] args) {

        int[] arr = {11,22,33,44,55,66,77};
        int index = getArrIndex(arr, 88);
        System.out.println(index);
    }

    /*
    二分查找法  前提 : 要求数组是有序 小-> 大
            结论
                索引小的元素 一定 小于 索引大的元素
           参数列表 int[] arr ,int num
           返回值  int
     */
    public static int getArrIndex(int[] arr ,int num){

        int min = 0;// 猜测索引区间的最小值
        int max = arr.length -1;//// 猜测索引区间的最大值
        int mid = (min + max) / 2;// 二分值  返回值

        while(true){// 默认查找,查中后结束循环

            if(min > max){// 元素不存在
                return -1;

            }

            if(arr[mid] > num) {//大
                max = mid - 1;
                mid = (min + max) / 2;

            }else if(arr[mid] < num){ // 小
                min = mid + 1;
                mid = (min + max) / 2;
            }else{// 以上条件都不满足
                return mid;
            }

        }
        // return mid;
    }
}
