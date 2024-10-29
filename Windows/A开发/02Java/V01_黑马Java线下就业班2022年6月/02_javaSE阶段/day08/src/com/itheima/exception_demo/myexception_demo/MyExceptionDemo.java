package com.itheima.exception_demo.myexception_demo;

import java.util.Scanner;

/*
    需求 : 设计一个方法 , 接收一个年龄(0-150) , 不满足要求的范围 , 则抛出一个自定义异常
 */
public class MyExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年龄:(0-150)");

        while (true) {
            try {
                int age = sc.nextInt();// 200
                printAge(age);
                break;
            } catch (AgeOutBoundsException e) {
                e.printStackTrace();
                System.out.println("请重新输入年龄:");
            }
        }
    }

    public static void printAge(int age) throws AgeOutBoundsException {
        if (age >= 0 && age <= 150) {
            System.out.println("年龄为:" + age);
        } else {
            // throw new AgeOutBoundsException();
            throw new AgeOutBoundsException("年龄" + age + "有误");
        }
    }
}
