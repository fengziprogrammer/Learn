package com.atguigu.exception;

import org.junit.Test;

/*
如何获取异常的信息？
异常的信息包含：
（1）异常的类型
（2）异常的原因message
（3）异常的堆栈跟踪信息

在catch分支中捕获了一个异常对象之后，可以获取异常的信息。
（1）e.printStackTrace();//打印异常的详细信息，包括（1）（2）（3）
（2）e.getMessage()方法。配合System.err.println()方法
（3）e.getClass()方法，配合System.err.println()方法
（4）e.getStackTrace()方法，配合System.err.println()方法
 */
public class TestExceptionInfo {
    public static void main(String[] args) {
        try {
            Object obj = 15;
            String str = (String) obj;
        } catch (Exception e) {
            //e.printStackTrace();//打印异常的详细信息，包括（1）（2）（3）
//            String message = e.getMessage();
//            System.err.println("message = " + message);

            Class aClass = e.getClass();
            System.err.println("aClass = " + aClass);

            StackTraceElement[] stackTrace = e.getStackTrace();//堆栈跟踪信息
        }
        /*
        Exception in thread "main" java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
	at com.atguigu.exception.TestExceptionInfo.main(TestExceptionInfo.java:13)
	（1）异常的类型：java.lang.ClassCastException
	（2）异常的原因：java.lang.Integer cannot be cast to java.lang.String
	（3）异常的堆栈跟踪信息：main(TestExceptionInfo.java:13)

         */
    }

    @Test
    public void test(){
        Object obj = 15;
        String str = (String) obj;
    }
}
