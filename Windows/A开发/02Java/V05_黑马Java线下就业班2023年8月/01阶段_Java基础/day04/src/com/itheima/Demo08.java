package com.itheima;

/*
    案例: 方法练习3(较大值)
 */
public class Demo08 {
    public static void main(String[] args) {
        System.out.println(getMax(10, 20, 30));
    }

    public static int getMax(int a, int b, int c) {
        //2.三元判断
        return (a > b ? a : b) > c ? (a > b ? a : b) : c;

        //1.if语句判断
//        if(a >= b){
//            //排除b的情况下,比较a和c,谁大谁就是max
//            if(a >= c){
//                return a;
//            }else {
//                return c;
//            }
//        }else {
//            //在排除a的情况下,比较b和c,谁大谁就是max
//            if(b >= c){
//                return b;
//            }else {
//                return c;
//            }
//        }
    }
}
