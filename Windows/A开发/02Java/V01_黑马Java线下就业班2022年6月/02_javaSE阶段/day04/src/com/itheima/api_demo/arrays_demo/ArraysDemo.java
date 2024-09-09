package com.itheima.api_demo.arrays_demo;

import com.sun.istack.internal.NotNull;

import java.util.Arrays;

/*
    Arrays类 : 数组的工具类
        构造方法 :  private Arrays(){}

        成员方法 :
            public static void sort(int[] arr) : 对数组的内容升序排序
            public static String toString(int[] arr) : 把数组中的内容以指定格式字符串进行返回
 */
public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr = {33, 22, 11, 55, 44};

        // System.out.println(ArraysDemo.toString(arr));
        // Arrays类 : public static String toString(int[] arr) : 把数组中的内容以指定格式字符串进行返回
        System.out.println(Arrays.toString(arr));

        //  public static void sort(int[] arr) : 对数组的内容升序排序
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

    }
//    // 我们自己完成的功能
//    public static String toString(int[] arr) {
//        // [元素1, 元素2, 元素3...元素n]
//        StringBuilder sb = new StringBuilder();
//        sb.append("[");
//        for (int i = 0; i < arr.length; i++) {
//            if (i == arr.length - 1) {
//                sb.append(arr[i]).append("]");
//            } else {
//                sb.append(arr[i]).append(", ");
//            }
//        }
//        return sb.toString();
//    }
//
//    // Arrays类的原码
//    public static String toString(int[] a) { // {}
//        if (a == null) {
//            return "null";
//        }
//
//        int iMax = a.length - 1;
//        if (iMax == -1) {
//            return "[]";
//        }
//
//        StringBuilder b = new StringBuilder();
//        b.append('[');
//        for (int i = 0;   ; i++) {
//            b.append(a[i]);
//            if (i == iMax) {
//                return b.append(']').toString();
//            }
//            b.append(", ");
//        }
//    }
}
