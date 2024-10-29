package com.itheima.exception_demo.trycatch_demo;

/*
    第一 : 捕获处理异常介绍 : try, catch
        之前的声明或者抛出都是将异常传递出去,让调用者知道异常信息。
        而捕获处理是本方法内部进行处理 , 能够阻止异常的传递，从而保证程序能够继续往下执行。

    第二 : 捕获异常的格式 :
        try {
            try中存放可能会出现问题的代码
            1.代码...
            2.代码...
            3.代码...
        } catch (异常类型 变量名) {
            4.处理异常方案
               举例 : 打印异常，获取异常原因记录日志..
        }

        5.其他代码...

     第三 : 捕获异常执行的方式
         1 如果 try 中没有遇到问题，怎么执行？
         2 如果 try 中代码遇到了问题，问题下面的代码还会执行吗？
         3 如果出现的问题没有被捕获，那么程序如何运行？
 */
public class Exception_TryCatch {
    public static void main(String[] args) {
        try {
            int[] arr = {33, 22, 11};

            // System.out.println(arr[1]);
            System.out.println(arr[3]); // new ArrayIndexOutOfBoundsException();

            System.out.println("获取数组的元素完毕!");
        } catch (NullPointerException e) {
            System.out.println("数组的索引越界!");
        }
    }
}
