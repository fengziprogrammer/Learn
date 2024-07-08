package com.atguigu.b_breakandcontinue;

public class Demo01BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i==3){
                //break;//结束循环
                continue;//结束本次循环进入下一次循环
            }
            System.out.println("我爱java"+i);
        }
    }
}
