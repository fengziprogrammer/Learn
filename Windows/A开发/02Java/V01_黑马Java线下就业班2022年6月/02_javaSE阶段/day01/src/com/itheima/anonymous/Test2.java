package com.itheima.anonymous;

import java.util.ArrayList;
import java.util.Scanner;

/*
        需求 :
        1 创建用户(User)对象 , 对象数据采用键盘录入而来

        2 用户(User)包含的属性 :
            用户名   (username)
            手机号码 (phoneNumber)
            登录密码 (password)
            确认密码 (confirm)
            电子邮箱 (email)
            性别     (sex)
            出生日期 (birthday)

        3 如果登录密码和确认密码不一致 , 重新输入

        4 把用户(User)对象 ,添加到ArrayList集合中 , 打印集合对象即可
 */
public class Test2 {
    public static void main(String[] args) {
        // 创建集合对象
        ArrayList<User> list = new ArrayList<>();// {4783da3f}

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String name = sc.nextLine();
        System.out.println("请输入密码");

        String password = sc.nextLine();
        System.out.println("请输入确认密码");

        String confirm;
        while (true) {
            confirm = sc.nextLine();
            // 如果登录密码和确认密码不一致 , 重新输入
            if (password.equals(confirm)) {
                break;
            } else {
                System.out.println("确认密码有误,请重新输入");
            }
        }

        System.out.println("请输入手机号码");
        String phoneNumber = sc.nextLine();
        System.out.println("请输入邮箱");
        String email = sc.nextLine();
        System.out.println("请输入性别");
        String sex = sc.nextLine();
        System.out.println("请输入生日");
        String birthday = sc.nextLine();


        // 创建元素(用户)对象
        User user = new User(name, password, phoneNumber, confirm, email, sex, birthday);

        // 把元素对象添加到集合中
        list.add(user);

        // 打印集合对象
        System.out.println(list);

    }
}
