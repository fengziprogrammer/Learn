package com.itheima.homework.test4;

/*
    请使用代码描述

    1. 写一个方法实现用户登陆，传入用户名和密码
    2. 如果用户名错误，就抛出自定义登陆异常(LoginException)，异常信息为用户名不存在。
    3. 如果密码错了就也抛出登陆异常,异常信息为密码错误
    4. 如果用户名和密码都对了,输出: 欢迎xxx
    说明：正确用户名和密码都是admin
 */
public class Test4 {
    public static void main(String[] args) {
        try {
            login("admin", "admin1111");
        } catch (LoginException e) {
            e.printStackTrace();
        }
    }

    public static void login(String username, String password) {
        if (!username.equals("admin")) {
            throw new LoginException("用户名错误");
        } else if (!password.equals("admin")) {
            throw new LoginException("密码错误");
        } else {
            System.out.println("登录成功,欢迎xxx");
        }
    }
}
