package com.atguigu.test;

public class Demo1 {

    /*
        可变参数
            形式参数的一种
            语法本质上  arr数组是一致
            功能上 更加强大  长度可以是0个到多个 数组个

        格式
            数据类型... 变量名
        注意事项
            如果参数列表 除了可变参数以外还有其他的参数,可变参数一定是写顺序最后
     */
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        // printArr(arr);
        // printArr(1,2,3);
    }

    public static void printArr(int[] arr){
        for(int i = 0; i <= arr.length -1;i++){
            System.out.println(arr[i]);
        }
    }

    /*public static void printArr(int...arr,int a){// 报错,
        for(int i = 0; i <= arr.length -1;i++){
            System.out.println(arr[i]);
        }
    }*/



}
