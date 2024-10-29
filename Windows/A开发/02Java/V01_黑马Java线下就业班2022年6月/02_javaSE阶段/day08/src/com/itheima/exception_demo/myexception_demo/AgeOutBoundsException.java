package com.itheima.exception_demo.myexception_demo;
// 自定义异常类
public class AgeOutBoundsException extends Exception{// 编译时期异常
//public class AgeOutBoundsException extends RuntimeException{// 运行时期异常

    public AgeOutBoundsException() {
    }

    public AgeOutBoundsException(String message) {
        super(message);
    }
}
