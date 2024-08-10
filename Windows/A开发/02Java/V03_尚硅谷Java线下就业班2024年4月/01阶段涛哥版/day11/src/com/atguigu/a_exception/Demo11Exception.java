package com.atguigu.a_exception;

import java.util.Scanner;

public class Demo11Exception {
    public static void main(String[] args) throws LoginUserException {
        //1.创建Scanner对象
        Scanner scanner = new Scanner(System.in);
        System.out.println("请您输入要登录的用户名:");
        String username = scanner.next();
        //2.定义一个字符串,代表已经注册过的用户名
        String name = "root";

        //3.判断
        if (username.equals(name)){
            System.out.println("登录成功");
        }else{
            //如果失败了,就创建异常对象
            throw new LoginUserException("登录失败");
        }
    }
}
