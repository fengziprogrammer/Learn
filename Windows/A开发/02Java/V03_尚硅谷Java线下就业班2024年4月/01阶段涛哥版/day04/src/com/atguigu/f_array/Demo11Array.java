package com.atguigu.f_array;

import java.io.FileOutputStream;

public class Demo11Array {
    public static void main(String[] args)throws Exception {
        int[] arr = {1,2,3};
        System.out.println(arr.length);
        System.out.println("============");
        arr = null;
        System.out.println(arr.length);

        FileOutputStream fos = new FileOutputStream("1.txt");
        fos.write("你好".getBytes());
    }
}
