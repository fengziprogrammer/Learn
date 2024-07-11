package com.atguigu.a_array;

public class Demo05Array {
    public static void main(String[] args) {
        //定义一个数组:int[] arr1 = {1,2,3,4,5}
        //将数组由原来的长度扩容到10

        int[] arr1 = {1,2,3,4,5};

        //定义新的新数组,长度定位10
        int[] arr2 = new int[10];

        //遍历arr1,将arr1中的数据放到arr2中

        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        /*for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }*/

        //将arr2的地址值赋值给arr1
        arr1 = arr2;

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
    }
}
