package com.atguigu.g_array;

public class Demo01GetMax {
    public static void main(String[] args) {
       // 1.创建数组,存储数据
        int[] arr = {5,3,5,6,8,4,5,7};
       // 2.定义一个变量,接收第一个元素 max
        int max = arr[0];
       // 3.遍历数组,将每一个元素获取出来
        for (int i = 1; i < arr.length; i++) {
       // 4.用max和遍历出来的元素比较,如果遍历出来的大,将大的元素重新赋值给max
            if (max<arr[i]){
                max = arr[i];
            }
        }
       // 5.输出max
        System.out.println("max = " + max);
    }
}
