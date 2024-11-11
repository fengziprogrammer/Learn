package com.itheima.single.demo2;

public class Test1 {
    public static void main(String[] args) {
        King k1 = King.getInstance();
        King k2 = King.getInstance();
        King k3 = King.getInstance();


        System.out.println(k1);
        System.out.println(k2);
        System.out.println(k3);
    }
}
