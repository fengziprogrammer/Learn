package com.itheima.exception_demo.trycatch_demo;

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
        try {

            int[] arr = {33, 22, 11};
            System.out.println(arr[3]);  //new ArrayIndexOutOfBoundsException();
            arr = null;
            System.out.println(arr.length); // new NullPointerException();

        } catch (Exception e) {
            System.out.println("统一处理方案...");
        }

    }

    private static void method2() {
        try {
            int[] arr = {33, 22, 11};

            // System.out.println(arr[3]);//new ArrayIndexOutOfBoundsException();

            arr = null;
            System.out.println(arr.length); // new NullPointerException();

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组的索引越界!");
        } catch (IndexOutOfBoundsException e) {

        } catch (NullPointerException e) {
            System.out.println("数组不能为null.");
        }
    }

    private static void method1() {
        int[] arr = {33, 22, 11};

        try {
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组的索引越界!");
        }

        try {
            arr = null;
            System.out.println(arr[1]);
        } catch (NullPointerException e) {
            System.out.println("数组不能为null.");
        }
    }
}
