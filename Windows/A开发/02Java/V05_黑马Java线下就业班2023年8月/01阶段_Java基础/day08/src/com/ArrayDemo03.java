package com;

/*
    案例: 案例2(获取最值)

        最值包含最大值,最小值
 */
public class ArrayDemo03 {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {4, 31, 5, 21, 10};
        //求数组的最大元素
        //1.暂且认为数组第一个元素是max
        int max = arr[0];
        //2.遍历数组 -> 数组名.fori + 回车
        for (int i = 1; i < arr.length; i++) {
            //3.判断,当前元素如果大于max
            if (arr[i] > max) {
                //4.修改max的值为当前元素
                max = arr[i];
            }
        }
        //循环结束,打印最终的max
        System.out.println("max:" + max);

        //求数组的最小元素
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("min:" + min);
    }
}
