package com.atguigu.a_array;

public class Demo06Array {
    public static void main(String[] args) {
        //1.定义两个数组
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        //2.定义新数组
        int[] newArr = new int[arr1.length+ arr2.length];
        //3.遍历arr1,将arr1的元素放到newArr
        for (int i = 0; i < arr1.length; i++) {
            newArr[i] = arr1[i];
        }

        /*for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]+" ");
        }*/

        int len = arr1.length;
        //4.遍历arr2,往newArr中存储
        for (int i = 0; i < arr2.length; i++) {
            /*
              第一次循环: newArr[3+0] = arr2[0]
              第二次循环: newArr[3+1] = arr2[1]
              第三次循环: newArr[3+2] = arr2[2]
             */
            newArr[len+i] = arr2[i];
        }

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]+" ");
        }
    }
}
