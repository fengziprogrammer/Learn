package com.atguigu.exam;

/*
1、随机产生10个[0,100)的偶数，并按照从大到小的顺序排列。
（可以使用冒泡排序或直接选择排序）
 */
public class Exam1 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        System.out.println("排序之前：");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*50)*2;//[0,50)*2==>[0,100)的偶数
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        //排序：冒泡排序
        for (int i = 1; i < arr.length; i++) {//轮数=arr.length-1轮
            //每一轮比较很多次
            /*
            i=1, j=0,1,2,....8
                 j+1=1,2，。。。9
            i=2,j=0,1,2,...7
            ...
             */
            for (int j = 0; j < arr.length-i; j++) {
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        //排序后显示结果
        System.out.println("排序后：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();



    }
}
