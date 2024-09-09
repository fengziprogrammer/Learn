package com.itheima.homework.test5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
    请编写程序，从控制台接收一个“生日”，格式：yyyy-MM-dd，程序要能够计算并打印他来到世界xx天。

    注意：“生日”必须早于“当前日期”，否则提示：生日必须早于当前日期！
 */
public class Test5 {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        System.out.println("生日(yyyy-MM-dd):");
        String birthday = sc.nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        // 解析 : String --> Date
        Date date = sdf.parse(birthday);
        long startTime = date.getTime();

        Date date1 = new Date();
        long endTime = date1.getTime();

        System.out.println("来到世界"+(endTime-startTime)/(1000L*60*60*24)+"天");
    }
}
