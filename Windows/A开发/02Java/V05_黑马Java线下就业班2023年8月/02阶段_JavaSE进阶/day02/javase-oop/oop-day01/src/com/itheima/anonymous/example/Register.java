package com.itheima.anonymous.example;

import java.util.ArrayList;
import java.util.Scanner;

/*
需求 :
        1 创建用户(User)对象 , 对象数据采用键盘录入而来
        2 用户(User)包含的属性 :
            用户名   (username)
            手机号码 (phonNumber)
            登录密码 (password)
            确认密码 (confirm)
            电子邮箱 (email)
            性别     (sex)
            出生日期 (birthday)
        3 如果登录密码和确认密码不一致 , 重新输入
        4 把用户(User)对象 ,添加到ArrayList集合中 , 打印集合对象即可
*/
public class Register {
    public static void main(String[] args) {
        //键盘录入
        Scanner sc = new Scanner(System.in);

        System.out.println("用户名：");
        String name = sc.nextLine();
        System.out.println("手机号码：");
        String phonNumber = sc.nextLine();

        String password = "";
        String confirm = "";

        while (true) {
            System.out.println("登录密码：");
            password = sc.nextLine();
            System.out.println("确认密码：");
            confirm = sc.nextLine();
            //判断：登录密码、确认密码是否一致
            if (password.equals(confirm)) {
                break;
            } else {
                System.out.println("登录密码和确认密码不一致，请重新输入!");
            }
        }

        System.out.println("电子邮箱：");
        String email = sc.nextLine();
        System.out.println("性别：");
        String sex = sc.nextLine();
        System.out.println("出生日期：");
        String birthday = sc.nextLine();


        //存储用户对象的集合
        ArrayList<User> userList = new ArrayList<>();
        //使用匿名对象，作为参数
        userList.add(new User(name, phonNumber, password, confirm, email, sex, birthday));


        for (int i = 0; i < userList.size(); i++) {
            //根据索引，获取集合中的每一个元素
            User user = userList.get(i);

            System.out.print(user.getName() + " , ");
            System.out.print(user.getPhoneNumber() + " , ");
            System.out.print(user.getPassword() + " , ");
            System.out.print(user.getConfirm() + " , ");
            System.out.print(user.getEmail() + " , ");
            System.out.print(user.getSex() + " , ");
            System.out.print(user.getBirthday() + "\n");
        }
    }
}
