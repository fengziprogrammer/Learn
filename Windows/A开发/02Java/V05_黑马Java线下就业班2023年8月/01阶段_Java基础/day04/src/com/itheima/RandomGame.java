package com.itheima;

import java.util.Random;
import java.util.Scanner;

/*
     Random 随机数对象的使用
        1.导包 import java.util.Random;
        2.创建对象 Random r = new Random();
        3.调用方法,指定范围,生成随机数 int num = r.nextInt(10); //[0-10)

     Scanner 键盘录入对象的使用
        1.导包 import java.util.Scanner;
        2.创建对象 Scanner sc = new Scanner(System.in);
        3.提示录入,调用方法,接收数据
            System.out.println("请输入一个整数:");
            int num = sc.nextInt();

     猜数字小游戏
        使用"随机数对象"生成一个[1-100]之间的随机整数,作为正确答案
        控制台提示用户猜,使用"键盘对象"接收用户猜的数据
        判断用户猜的结果
            你猜的数据超出了范围,请重新输入
            猜大了
            猜小了
            恭喜你,猜中了!
 */
public class RandomGame {
    public static void main(String[] args) {
        //使用Random生成正确答案
        Random r = new Random();
        int number = r.nextInt(100) + 1;
        //使用循环模拟多次游戏 -> 不知道循环次数,选择死循环 -> 考虑程序的出口(死循环的停止条件)
        while (true) {
            //使用Scanner接收用户猜的数据
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你猜的数据:");
            int guessNum = sc.nextInt();
            //判断
            if (guessNum < 1 || guessNum > 100) {
                System.out.println("你猜的数据超出了范围,请重新输入");
            } else if (guessNum > number) {
                System.out.println("猜大了");
            } else if (guessNum < number) {
                System.out.println("猜小了");
            } else {
                System.out.println("恭喜你,猜中了!");
                //如果才对了结束死循环
                break;
            }
        }
    }
}
