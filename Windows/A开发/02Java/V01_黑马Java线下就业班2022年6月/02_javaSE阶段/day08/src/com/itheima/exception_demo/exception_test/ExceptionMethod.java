package com.itheima.exception_demo.exception_test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
    Throwable类:
        public String getMessage()    : 会把异常的  原因 打印在控制台
        public String toString()	  : 会把异常的  类型 + 原因打印在控制台
        public void printStackTrace() :	把异常的错误信息输出在控制台
 */
public class ExceptionMethod {
    public static final Logger LOGGER = LoggerFactory.getLogger("ExceptionMethod");
    public static void main(String[] args) {

        int[] arr = {33, 22, 11};

        try {
            System.out.println(arr[13]);
        } catch (Exception e) { // Exception e = new 异常对象
            // public String getMessage() : 	会把异常的  原因 打印在控制台
             System.err.println(e.getMessage()); // 13

            // public String toString()	  : 会把异常的  类型 + 原因打印在控制台
            // System.out.println(e.toString()); // java.lang.ArrayIndexOutOfBoundsException: 13

            // public void printStackTrace()	把异常的错误信息输出在控制台
            // e.printStackTrace();
             LOGGER.error(e.toString());
        }

        System.out.println("结束!");
    }
}
