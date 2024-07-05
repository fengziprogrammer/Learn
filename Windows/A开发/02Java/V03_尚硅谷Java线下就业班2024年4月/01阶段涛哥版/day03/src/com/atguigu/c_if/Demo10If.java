package com.atguigu.c_if;

import java.util.Scanner;

public class Demo10If {
    public static void main(String[] args) {
       //95~100		山地自行车一辆
       //90~94		游乐场玩一次
       //80~89		变形金刚玩具一个
       //80以下	   胖揍一顿
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        /*if (score>=95 && score<=100){
            System.out.println("山地自行车一辆");
        }else if (score>=90 && score<=94){
            System.out.println("游乐场玩一次");
        }else if(score>=80 && score<=89){
            System.out.println("变形金刚一个");
        }else if (score>=0 && score<80){
            System.out.println("胖揍一顿");
        }else{
            System.out.println("弄死你呀,一共就100分,还给我考冒了");
        }*/

        if (score<0 || score>100){
            System.out.println("弄死你呀,一共就100分,还给我考冒了");
        }else{
            if (score>=95 && score<=100){
                System.out.println("山地自行车一辆");
            }else if (score>=90 && score<=94){
                System.out.println("游乐场玩一次");
            }else if(score>=80 && score<=89){
                System.out.println("变形金刚一个");
            }else if (score>=0 && score<80){
                System.out.println("胖揍一顿");
            }
        }
    }
}
