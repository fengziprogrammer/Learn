package com;

/*
    案例: 二维数组的遍历

 */
public class ArrayDemo07 {
    public static void main(String[] args) {
        //定义二维数组
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        //遍历二维数组 -> 快捷键
        for (int i = 0; i < arr.length; i++) {
            //遍历一维数组 -> 快捷键
            for (int j = 0; j < arr[i].length; j++) {
                //一行打印元素
                System.out.print(arr[i][j] + " ");
            }
            //一维数组遍历结束, 换行
            System.out.println();
        }
    }
}
