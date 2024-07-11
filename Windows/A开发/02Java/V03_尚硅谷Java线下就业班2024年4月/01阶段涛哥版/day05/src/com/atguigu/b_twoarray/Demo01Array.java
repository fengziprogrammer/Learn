package com.atguigu.b_twoarray;

public class Demo01Array {
    public static void main(String[] args) {
        //动态初始化
        int[][] arr1 = new int[3][3];
        int arr2[][] = new int[3][3];
        int[] arr3[] = new int[3][3];

        //静态初始化
        String[][] arr4 = {{"白骨精","蜘蛛精","老鼠精"},{"郭嘉","大乔"},{"宋江","李逵","卢俊义"}};

        System.out.println("================");

        int[][] arr5 = new int[3][3];
        for (int i = 0; i < arr5.length; i++) {
            System.out.println(arr5[i]);
        }

        System.out.println("================");

        int[][] arr6 = new int[3][];
        for (int i = 0; i < arr6.length; i++) {
            System.out.println(arr6[i]);
        }
    }
}
