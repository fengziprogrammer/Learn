package com.atguigu.iterator;

import java.util.Arrays;

public class Demo8 {

    /*
    增强for循环
            底层依赖 迭代器
            作用
                遍历集合/数组里面的元素
             格式
                for(容器的元素类型 元素名:容器){
                }
          注意事项
             增强for循环 只做遍历时使用
                1> 内部操作
                    集合操作 -> 并发修改异常
                    没有迭代器引用
                2>  赋值  做不了
     */
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        for (int i = 0; i < arr.length; i++) {
             arr[i] = 88;
        }

        System.out.println(Arrays.toString(arr));//? [88, 88, 88, 88, 88]
        System.out.println("------------------");

        for(int num: arr){// num 代表的是每一个元素
            num = 99;
            System.out.println("*");
        }
        System.out.println(Arrays.toString(arr));//
    }
}
