package com.itheima.exception_demo.trycatch_demo;

import java.util.Objects;

/*
    多异常捕获处理方案

    1 多个异常，每个异常单独处理
          try{
              异常1
          }catch(异常1){

          }
          try{
              异常2
          }catch(异常2){

          }

    2 多个异常，一次捕获，多次处理

      try{
          异常1
          异常2
      }catch(异常1){
      }catch(异常2){
      }

    3 多个异常，异常一次捕获，一次处理
      try{
          异常1
          异常2
      }catch(Exception e){
      }
 */
public class Exception_TryCatch2 {
    public static void main(String[] args) {
        // 3 多个异常，异常一次捕获，一次处理
        try {
            int[] arr = {11, 22, 33};
            System.out.println(arr[3]);
            Object obj = new String("abc");
            Integer i = (Integer) obj;
        } catch (Exception e) {
            System.out.println("统一处理方案");
        }

    }

    private static void method2() {
        // 2 多个异常，一次捕获，多次处理
        try {
            int[] arr = {11, 22, 33};
            System.out.println(arr[3]);
            Object obj = new String("abc");
            Integer i = (Integer) obj;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("索引越界");
        } catch (ClassCastException e) {
            System.out.println("类型转换异常");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("类型转换异常");
        }
    }

    private static void method1() {
        //  1 多个异常，每个异常单独处理
        try {
            int[] arr = {11, 22, 33};
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("索引越界");
        }

        // 五百行代码....

        try {
            Object obj = new String("abc");
            Integer i = (Integer) obj;
        } catch (ClassCastException e) {
            System.out.println("类型转换异常");
        }
    }
}