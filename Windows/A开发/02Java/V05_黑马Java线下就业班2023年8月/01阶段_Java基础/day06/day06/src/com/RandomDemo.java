package com;
/*
     随机数对象Random
        1. 导包
        2. 创建随机数对象
        3. 调用方法,指定范围,生成随机数

     猜数字小游戏
        练习目标是熟练的掌握Scanner和Random
 */

import java.util.Random;
import java.util.Scanner;

public class RandomDemo {
    public static void main(String[] args) {
        //创建键盘对象
        Scanner sc = new Scanner(System.in); //new对象的动作一定要放在循环外!
        //使用随机数对象生成一个正确答案,范围[1-100]
        Random r = new Random();
        int number = r.nextInt(100) + 1; //[1-100]
        //在这里打印number查看他的结果,有利于我们对下面代码的分析! -> 手动断点调试!
        System.out.println(number);
        //使用循环模拟多次游戏
        while (true) {
            //提示用户猜
            System.out.println("请输入你猜的数字:");
            //接收键盘录入的数据
            int guessNum = sc.nextInt();
            //判断用户猜的guessNum和正确答案number之间的关系
            //做健壮性的判断
            if (guessNum < 1 || guessNum > 100) {
                System.out.println("你输入的数字超出了范围!");
            } else if (guessNum > number) {
                System.out.println("猜大了!");
            } else if (guessNum < number) {
                System.out.println("猜小了!");
            } else {
                System.out.println("恭喜你~猜对了!");
                //结束死循环
                break;
            }
        }
    }
}
