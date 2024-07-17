package com.atguigu.a_method;

public class Demo05Method {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 6, 7, 5, 4};
        int max = getMax(arr);
        System.out.println("max = " + max);
    }

    public static int getMax(int[] arr) {
        // 2.定义一个变量,接收第一个元素 max
        int max = arr[0];
        // 3.遍历数组,将每一个元素获取出来
        for (int i = 1; i < arr.length; i++) {
            // 4.用max和遍历出来的元素比较,如果遍历出来的大,将大的元素重新赋值给max
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        return max;

    }
}
