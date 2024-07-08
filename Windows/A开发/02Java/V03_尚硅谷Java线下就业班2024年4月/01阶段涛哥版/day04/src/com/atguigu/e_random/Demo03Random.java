package com.atguigu.e_random;

import java.util.Random;
import java.util.Scanner;

public class Demo03Random {
    public static void main(String[] args) {
        //1.创建Random和Scanner对象
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        //2.调用Random中的nextInt方法随机一个数 rdNumber
        int rdNumber = rd.nextInt(900) + 100;
        while (true) {
            //3.调用Scanner中的nextInt方法键盘录入一个数 scNumber
            System.out.println("请您猜一个数:");
            int scNumber = sc.nextInt();
            //4.如果scNumber>rdNumber,证明猜大了
            //5.如果scNumber<rdNumber,证明猜小了
            //6.如果scNumber=rdNumber,证明猜中了
            if (scNumber > rdNumber) {
                System.out.println("对不起,您猜大了!");
            } else if (scNumber < rdNumber) {
                System.out.println("对不起,您猜小了!");
            } else {
                System.out.println("恭喜您,中奖了!中了一个大嘴巴子!");
                break;
            }
        }

    }
}
