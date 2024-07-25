package com.atguigu.exam;

public class ArrayTools {
    /*
    返回值类型写int，表示只返回1个整数
     */
   // int sort(int[] arr){ }
    /*
    返回值类型写int[]，表示返回整个整数数组。

     */
/*    int[] sort(int[] arr){
        for (int i=1; i<arr.length; i++){
            for(int j=0; j<arr.length-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;//数组名中存储了数组的首地址
    }*/
//此处sort方法不需要排序。因为整个排序过程，就是针对原数组进行排序的。
    void sort(int[] arr){
        for (int i=1; i<arr.length; i++){
            for(int j=0; j<arr.length-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    //顺序查找
    int find(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if(target == arr[i]){
                return i;
            }
        }
        return -1;
    }


    int binarySearch(int[] arr, int target){
        for(int left = 0,right = arr.length-1; left<=right;){
            int mid = left + (right-left)/2;
            if(arr[mid] == target){
                return mid;//这里也依然没有考虑重复元素
            }else if(arr[mid] > target){
                right = mid-1;
            }else {
                left= mid +1;
            }

        }
        return -1;
    }

    String toString(int[] arr){
        String str = "{";
        for (int i = 0; i < arr.length; i++) {
            if(i==0){
                str += arr[i];
            }else{
                str += "," + arr[i];
            }
        }
        str += "}";
        return str;
    }

}
