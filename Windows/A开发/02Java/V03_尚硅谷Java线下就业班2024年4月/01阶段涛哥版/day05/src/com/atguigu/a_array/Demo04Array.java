package com.atguigu.a_array;

import java.util.Scanner;

public class Demo04Array {
    public static void main(String[] args) {
        //1.创建Scanner对象
        Scanner sc = new Scanner(System.in);
        //2.定义数组,随意存点数据
        int[] arr = {11, 22, 33, 44, 55, 66, 33};
        //3.键盘录入一个整数 data
        int data = sc.nextInt();

        //定义一个变量,做标记
        int flag = 0;


        //4.遍历数组,将每一个元素获取出来
        for (int i = 0; i < arr.length; i++) {
            if (data == arr[i]) {
                //5.在遍历的过程中,用data和遍历出来的元素比较,如果相等输出对应的索引
                System.out.println(i);
                flag++;
            }
        }

        //出了循环,再次判断flag,如果还是0,证明在遍历的过程中,if根本没有进去过
        if (flag==0){
            System.out.println("没找到");
        }
    }
}
