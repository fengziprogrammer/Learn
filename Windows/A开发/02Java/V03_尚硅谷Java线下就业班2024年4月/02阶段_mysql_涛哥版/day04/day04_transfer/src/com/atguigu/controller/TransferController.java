package com.atguigu.controller;

import com.atguigu.service.AccountService;

import java.util.Scanner;

public class TransferController {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请您输入出钱人的姓名:");
        String outName = sc.next();
        System.out.println("请您输入收钱人的姓名:");
        String inName = sc.next();
        System.out.println("请您输入转账金额:");
        int money = sc.nextInt();

        //调用service方法,实现转账
        AccountService as = new AccountService();
        as.transfer(outName,inName,money);
    }
}
