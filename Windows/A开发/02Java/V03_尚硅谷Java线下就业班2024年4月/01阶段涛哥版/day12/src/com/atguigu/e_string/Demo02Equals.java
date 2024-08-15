package com.atguigu.e_string;

import java.util.Scanner;

public class Demo02Equals {
    public static void main(String[] args) {
        //1.先定义两个字符串,表示已经注册过的用户名和密码
        String username = "root";
        String password = "1234";
        //2.创建Scanner对象,调用next方法,录入用户名和密码
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请您输入用户名:");
            String name = sc.next();
            System.out.println("请您输入密码:");
            String pwd = sc.next();
            //3.如果用户名和密码跟注册过的一样,登录成功
            if (name.equals(username) && pwd.equals(password)){
                System.out.println("登录成功");
                break;
            }else{
                if (i==2){
                    System.out.println("账号冻结,请解冻");
                }else{
                    //4.否则,登录失败
                    System.out.println("登录失败");
                }

            }
        }

    }
}
