package com.atguigu.exception;

//NotATriangleException是编译时异常类型
public class NotATriangleException extends Exception {
    public NotATriangleException() {
    }

    public NotATriangleException(String message) {
        super(message);
    }
}
