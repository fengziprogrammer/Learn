package com.atguigu.f_static;

public class ArraysUtils {
    //工具类不需要new对象调用,只需要类名调用,所以我们可以将构造方法变成私有的
    private ArraysUtils(){
    }

    public static void print(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i==arr.length-1){
                System.out.print(arr[i]+"]");
            }else{
                System.out.print(arr[i]+", ");
            }
        }
    }
}
