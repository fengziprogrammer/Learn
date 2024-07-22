package com.atguigu.i_array;

public class Demo01BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //1.确定最大索引和最小索引
        int min = 0;
        int max = arr.length - 1;
        //2.确定要查找的数据
        int key = 6;

        //3.循环比较,循环找
        while (min <= max) {
            //4.循环的计算中间索引
            int mid = (min + max) / 2;
            if (key>arr[mid]){
                min = mid+1;
            }else if(key<arr[mid]){
                max = mid-1;
            }else{
                System.out.println(mid);
                break;
            }
        }
    }
}
