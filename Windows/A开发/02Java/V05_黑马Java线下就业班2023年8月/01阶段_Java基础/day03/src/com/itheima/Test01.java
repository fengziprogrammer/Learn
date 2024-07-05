package com.itheima;
/*
    continue和break的使用
 */
public class Test01 {
    public static void main(String[] args) {
        /*
            2次 break;
            7次 continue;
            13次 System.out.println("史老师真帅");
         */
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                System.out.println("史老师真帅");
            }
            System.out.println("史老师真帅");
        }
    }
}
