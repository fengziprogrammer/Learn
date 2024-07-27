package com;

import java.util.Random;

/*
    案例: 案例6(二维数组元素打乱)
        需要两个随机索引
 */
public class ArrayDemo08 {
    public static void main(String[] args) {
        //定义数组
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        //创建随机数对象
        Random r = new Random();
        //遍历数组,打乱元素
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                //生成两个随机索引
                int x = r.nextInt(arr.length); //x代表是哪一个随机一维数组
                int y = r.nextInt(arr[x].length); //y代表是这个一维数组中的哪一个元素
                //元素交换
                int temp = arr[i][j];
                arr[i][j] = arr[x][y];
                arr[x][y] = temp;
            }
        }
        //遍历数组,查看结果
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();//换行
        }
    }
}
