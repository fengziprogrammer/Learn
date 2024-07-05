package com.atguigu.b_switch;

import java.util.Scanner;

public class Demo01Switch {
    public static void main(String[] args) {
        //创建Scanner对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请你输入一个整数:");
        int data = sc.nextInt();
        switch (data){
            case 1:
                System.out.println("离离原上草");
                break;
            case 2:
                System.out.println("一岁一枯荣");
                break;
            case 3:
                System.out.println("野火烧不尽");
                break;
            case 4:
                System.out.println("春风吹又生");
                break;
            default:
                System.out.println("输入错误");
                break;
        }
    }
}
