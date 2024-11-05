package com.itheima.homework.test2;

import java.util.Map;
import java.util.Scanner;

/*
     请定义main()方法，在main()中按以下顺序要求编写代码：

    1. 定义一个String[]数组如下：
       String[] arr = {”星期一”,”星期二”,”星期三”,”星期四”,”星期五”,”星期六”,”星期日”};

    2. 请用户输入一个整数1--7的值：
       根据用户输入，从数组中取出对应的星期名称，例如：
       用户输入：1
       程序提示：星期一

    3. 为了防止用户输入小于1或者大于7的值，请使用异常处理从数组中取出对应的“星期名称”，在异常处理中打印：输入错误！！
 */
public class Test2 {
    public static void main(String[] args) {
        String[] arr = {"星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期日"};
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入1-7:");
        int weekDay = sc.nextInt();

        try {
            System.out.println(arr[1- weekDay]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("录入的数据不再1-7之间");
        }
    }
}
