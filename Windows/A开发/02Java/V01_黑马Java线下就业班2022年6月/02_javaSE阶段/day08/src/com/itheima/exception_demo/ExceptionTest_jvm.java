package com.itheima.exception_demo;
/*
    JVM 的默认处理方案 :

    如果程序出现了问题，我们没有做任何处理，最终JVM会做默认的处理 , 那么JVM是如何处理的呢 ?
        1 在控制台以红色字体打印异常的  类型  +  原因  +  位置
        2 终止了程序
 */
public class ExceptionTest_jvm {
    public static void main(String[] args) {
        int[] arr = new int[3];

        System.out.println(arr[13]);// new ArrayIndexOutOfBoundsException();

        System.out.println("执行了吗?");
    }
}
