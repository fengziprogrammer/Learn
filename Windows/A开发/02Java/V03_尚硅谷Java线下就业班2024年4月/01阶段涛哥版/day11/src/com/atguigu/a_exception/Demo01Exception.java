package com.atguigu.a_exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Demo01Exception {
    public static void main(String[] args){
        //Error
        //int[] arr1 = new int[999999999];

        //运行时期异常
        int[] arr2 = new int[3];
        System.out.println(arr2[3]);

        /*
          编译时期异常->
          不是我们写的语法错误,
          而是人家底层给我们抛了一个编译时期异常对象,底层抛出的异常继承自Exception
          我们一用就出现了编译时期异常
         */
        //FileOutputStream fos = new FileOutputStream("day11_exception\\1.txt");
    }
}
