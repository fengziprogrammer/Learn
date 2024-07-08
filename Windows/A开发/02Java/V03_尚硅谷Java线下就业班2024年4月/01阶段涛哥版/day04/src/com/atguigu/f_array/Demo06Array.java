package com.atguigu.f_array;

public class Demo06Array {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        //定义一个数组arr2,将arr1中的元素复制到arr2中
        //创建一个长度为5的arr2数组
        int[] arr2 = new int[arr1.length];

        //arr2[0] = arr1[0]; //将arr1的0索引位置上的元素赋值到arr2数组的0索引上
        //arr2[1] = arr1[1];
        //arr2[2] = arr1[2];
        //arr2[3] = arr1[3];
        //arr2[4] = arr1[4];

        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
    }
}
