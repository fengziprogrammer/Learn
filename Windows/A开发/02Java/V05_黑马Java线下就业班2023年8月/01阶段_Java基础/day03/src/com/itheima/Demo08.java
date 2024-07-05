package com.itheima;

/*
    案例: while循环案例1(求奇数和)
        求1到100之间的奇数和
 */
public class Demo08 {
    public static void main(String[] args) {
        //定义求和变量
        int sum = 0;
        //初始化语句
        int i = 1;
        //判断语句
        while (i <= 100){
            //循环体
            if (i % 2 != 0) {
                sum += i;
            }
            //控制语句
            i++;
        }
        System.out.println("sum:" + sum); //sum:2500


//        int sum = 0;
//        for (int i = 1; i <= 100; i++) {
//            if (i % 2 != 0) {
//                sum += i;
//            }
//        }
//        System.out.println("sum:" + sum);
    }
}
