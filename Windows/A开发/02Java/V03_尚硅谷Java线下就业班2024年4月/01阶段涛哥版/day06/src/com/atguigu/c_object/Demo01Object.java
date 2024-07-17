package com.atguigu.c_object;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Demo01Object {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*
          Scanner就是我们找来的对象
          next方法就是此对象的功能
         */
        String data = sc.next();
        System.out.println("data = " + data);

        System.out.println("=================");

        /*
          Random就是我们找来的对象
          nextInt方法就是此对象的功能
         */
        Random random = new Random();
        int data2 = random.nextInt(10);
        System.out.println("data2 = " + data2);

        System.out.println("=================");

        int[] arr = {1, 2, 3, 4};
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i] + "]");
            }else{
                System.out.print(arr[i] + ", ");
            }
        }

        System.out.println("");
        /*
          Arrays就是我们找来的对象
          toStrng就是此对象提前封装好的功能
          我们只需要找到对象,调用对象中的功能,就能实现我们的需求
          至于toString方法底层怎么写的,我们无需关注
         */
        System.out.println(Arrays.toString(arr));
    }
}
