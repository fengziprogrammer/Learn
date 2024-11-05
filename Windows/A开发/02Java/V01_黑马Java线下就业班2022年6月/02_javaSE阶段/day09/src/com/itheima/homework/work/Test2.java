package com.itheima.homework.work;

import java.util.Scanner;

/*
    1. 定义一个String[]数组如下：

   `String[] arr = {”星期一”,”星期二”,”星期三”,”星期四”,”星期五”,”星期六”,”星期日”};`

    2. 请用户输入一个整数1--7的值：
       根据用户输入，从数组中取出对应的星期名称，例如：
       用户输入：1
       程序提示：星期一

    3. 为了防止用户输入小于1或者大于7的值，请使用异常处理从数组中取出对应的“星期名称”，在异常处理中打印：输入错误！！


 */
public class Test2 {
    public static void main(String[] args) {
        String[] arr = {"星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期日" };

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数(1-7):");

        int weekDay = sc.nextInt();

        if(weekDay < 1 || weekDay > 7){
            // 抛出异常
            throw new RuntimeException("您录入的数据不再1-7之内!");
        }

        switch (weekDay){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
        }
    }
}
