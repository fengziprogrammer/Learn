package com.atguigu.exer;

import java.util.Scanner;

/*
从键盘输入两个整数，求它们的商。尽量考虑和避免异常，无法避免的使用try...catch处理。
（1）如果用户输入的非整数，使用try...catch处理，并且让用户重新输入
（2）如果用户输入的除数为0，请用户重新输入。
 */
public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a ;
        while(true) {
            try {
                System.out.print("请输入被除数（被除数是一个整数）：");
                a = input.nextInt();
                break;
            } catch (Exception e) {
                e.printStackTrace();//给程序员看
                input.nextLine();
                System.out.println("输出错误，请重新输入整数！");//给用户看
            }
        }

        int b = 0;
        while (true) {
            try {
                System.out.print("请输入除数（除数也是一个整数）：");
                b = input.nextInt();
                /*if(b == 0){
                    System.out.println("除数不能为0，请重新输入！");
                }else {
                    break;
                }*/
                if(b == 0){
                   throw new Exception("除数不能为0，请重新输入！");
                }
                break;
            } catch (Exception e) {
                e.printStackTrace();
                input.nextLine();
                System.out.println("输出错误，请重新输入整数！");//给用户看
            }
        }

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println(a + "/" + b + "=" + a/b);

    }
}
