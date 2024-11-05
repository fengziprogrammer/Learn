package com.itheima.homework.work;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
    请定义main()方法，在main()中按以下顺序要求编写代码：

    1. 分别从控制台接收两个整数
    2. 计算“第一个数 / 第二个数”的结果，并打印；
    3. 为了防止第二个数为0导致异常，请在计算时使用异常处理。当出现异常时，向用户打印：第二个数不能为0！！
 */
public class Test1 {
    public static void main(String[] args) {


        while(true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("请输入第一个整数:");
                int num1 = sc.nextInt();// fghj
                System.out.println("请输入第二个整数:");
                int num2 = sc.nextInt();
                System.out.println(num1 / num2);
                break;
            } catch (InputMismatchException e) {
                System.out.println("您录入的数据类型有问题 , 请输入整数!");
                e.printStackTrace();
            } catch (ArithmeticException e) {
                System.out.println("0不能做为除数!");
                e.printStackTrace();
            }
        }
    }
}
