package com.atguigu.c_if;

import java.util.Scanner;

public class Demo09If {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请您输入一个数:");
        int week = sc.nextInt();
        /*if (week==1){
            System.out.println("周一");
        }else if(week==2){
            System.out.println("周二");
        }else if(week==3){
            System.out.println("周三");
        }else if(week==4){
            System.out.println("周四");
        }else if(week==5){
            System.out.println("周五");
        }else if(week==6){
            System.out.println("周六");
        }else if(week==7){
            System.out.println("周日");
        }else{
            System.out.println("输入有误!");
        }*/

        if (week<1 || week>7){
            System.out.println("输入有误");
        }else{
            if (week==1){
                System.out.println("周一");
            }else if(week==2){
                System.out.println("周二");
            }else if(week==3){
                System.out.println("周三");
            }else if(week==4){
                System.out.println("周四");
            }else if(week==5){
                System.out.println("周五");
            }else if(week==6){
                System.out.println("周六");
            }else if(week==7){
                System.out.println("周日");
            }
        }
    }
}
