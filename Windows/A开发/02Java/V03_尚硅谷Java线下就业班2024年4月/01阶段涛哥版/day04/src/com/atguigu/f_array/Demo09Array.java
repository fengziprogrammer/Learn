package com.atguigu.f_array;

public class Demo09Array {
    public static void main(String[] args) {
        String[] arr = {"许嵩","张杰","周杰伦","胡歌","郑源"};
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("===============");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("==============");

        /*
          遍历快捷键
          数组名.fori
         */
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
