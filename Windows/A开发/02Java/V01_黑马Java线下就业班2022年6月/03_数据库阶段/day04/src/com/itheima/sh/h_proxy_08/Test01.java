package com.itheima.sh.h_proxy_08;

public class Test01 {
    public static void main(String[] args) {
       //1.创建实现类对象
        UserServiceImpl userService = new UserServiceImpl();
        //2.使用对象调用实现类方法
        userService.login();
        userService.delete();
        userService.query();
    }
}
