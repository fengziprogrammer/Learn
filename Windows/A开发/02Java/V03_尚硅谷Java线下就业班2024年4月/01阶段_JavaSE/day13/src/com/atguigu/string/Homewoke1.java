package com.atguigu.string;


import java.util.Scanner;

public class Homewoke1 {

    /*
    需求:模拟用户登录,共三次机会,并提示还有几次。(正确用户名和密码都是admin)
        分析:
            1> 定义正确的用户名和密码
            2> 定义计数器统计剩余次数
            3> 循环  while     (Scanner)
                用户名和密码校验
                    正确  -> 提示登录成功
                    错误  -> 提示还有几次机会
     */
    public static void main(String[] args) {

      /*  // 1> 定义正确的用户名和密码
        String s1 = "admin";
        String s2 = "admin";

        // 2> 定义计数器统计剩余次数
        int count = 3;

        // 3> 循环  while
        Scanner sc = new Scanner(System.in);
        while(count > 0){
            System.out.println("请输入您的用户名");
            String str1 = sc.nextLine();

            System.out.println("请输入您的密码");
            String str2 = sc.nextLine();

            // 用户名和密码校验
            if(str1.equals(s1) && str2.equals(s2)){// // 正确  -> 提示登录成功
                System.out.println("恭喜" + str1 + ",登录成功");
                break;// 如果成功直接退出
            }else{// 错误  -> 提示还有几次机会
                count--;
                if(count > 0){
                    System.out.println("错误,还有" + count + "次机会");
                }else{
                    System.out.println("机会次数使用完毕");
                }
            }



        }*/

        // 编码习惯的推荐
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入您的用户名");
            String name = sc.nextLine();

            System.out.println("请输入您的密码");
            String pwd = sc.nextLine();
            
            // if( name.equals("admin") && pwd.equals("admin")){ // 正确  -> 提示登录成功
            if( "admin".equals(name) && "admin".equals(pwd)){ // 正确  -> 提示登录成功
                System.out.println("恭喜" + name + ",登录成功");
                break;// 如果成功直接退出
            }else{

                if(i == 2){
                    System.out.println("机会次数使用完毕");
                }else{
                    System.out.println("错误,还有" + (2-i) + "次机会");
                }
            }
        }


    }
}


