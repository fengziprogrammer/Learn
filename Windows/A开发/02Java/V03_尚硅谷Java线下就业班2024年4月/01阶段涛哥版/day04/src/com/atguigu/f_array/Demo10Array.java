package com.atguigu.f_array;

public class Demo10Array {
    public static void main(String[] args) {
        //数组索引越界异常-> ArrayIndexOutOfBoundsException
        int[] arr = {1,2,3,4,5};
       /* for (int i = 0; i <= arr.length; i++) {
            System.out.println(arr[i]);
        }*/

        System.out.println("================");

        int[] arr1 = new int[3];
        arr1[0] = 100;
        arr1[1] = 200;
        arr1[2] = 300;
        arr1[3] = 400;//越界,因为arr1没有3索引
    }
}
