package com.itheima.exception_demo.exception_test;

/*
    Throwable类:
        public String getMessage()    : 会把异常的  原因 打印在控制台
        public String toString()	  : 会把异常的  类型 + 原因打印在控制台
        public void printStackTrace() :	把异常的错误信息输出在控制台
 */
public class ExceptionMethod {
    public static void main(String[] args) {
        try {
            int[] arr = {11,22,33};
            System.out.println(arr[3]);
        } catch (Exception e) {
            // public String getMessage()    : 会把异常的  原因 打印在控制台
            System.out.println(e.getMessage());

            // public String toString()	  : 会把异常的  类型 + 原因打印在控制台
            // System.out.println(e.toString());

            // public void printStackTrace() :	把异常的错误信息输出在控制台
            // e.printStackTrace();
        }

        System.out.println("代码....");
    }
}