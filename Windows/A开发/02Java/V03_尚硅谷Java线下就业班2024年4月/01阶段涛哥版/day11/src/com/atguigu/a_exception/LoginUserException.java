package com.atguigu.a_exception;

public class LoginUserException extends Exception /*RuntimeException*/{
    public LoginUserException() {
    }

    public LoginUserException(String message) {
        super(message);
    }
}
