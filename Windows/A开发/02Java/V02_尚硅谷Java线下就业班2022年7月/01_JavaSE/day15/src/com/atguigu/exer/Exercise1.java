package com.atguigu.exer;

public class Exercise1 {
    public static void main(String[] args) {
        for (int i=10; i>=1; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);//选中要放到try中的代码，按快捷键ctrl + alt + T
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("新年快乐！");
    }
}


