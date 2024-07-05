package com.itheima;

import java.util.Random;
import java.util.Scanner;

/*
    Random随机数对象:
        1. 导包 import java.util.Random;
        2. 创建对象 Random r = new Random();
        3. 调用方法,接收数据 int num = r.nextInt(数据); //范围取值: 从0到指定数据,包含0包含指定数据

    猜数字小游戏:
        使用Random随机数对象, 生成一个[1-100]之间的整数, 作为正确答案
        使用Scanner, 提示用户录入猜的数据并接收, 使用if语句判断用户猜的结果, 打印对应提示
            情况1: 猜的数超出了[1-100]的范围! 请重新输入!
            情况2: 猜大了
            情况3: 猜小了
            情况4: 恭喜你!猜对了
 */
public class RandomGame {
    public static void main(String[] args) {
        //创建随机数对象
        Random r = new Random();
        //生成1到100之间的一个随机数
        int num = r.nextInt(100) + 1; //0到指定值,包含0不包含指定值
        //创建键盘对象
        Scanner sc = new Scanner(System.in);
        //使用死循环模拟多次游戏
        for (; ; ) {
            //提示用户猜
            System.out.println("请输入你猜的数据:");
            //接收
            int guessNum = sc.nextInt();
            //做健壮性的判断
            if (guessNum > 100 || guessNum < 1) {
                System.out.println("你输入的数据有误!请重新输入!");
            } else if (guessNum > num) {
                System.out.println("猜大了!");
            } else if (guessNum < num) {
                System.out.println("猜小了!");
            } else {
                System.out.println("恭喜你~猜对了!");
                //结束循环
                break;
            }
        }
    }
}
