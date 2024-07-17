package com.atguigu.f_object;

public class Test03 {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        System.out.println(p1);
        p1.brand = "华为";
        p1.price = 6999;

        Phone p2 = p1;
        System.out.println(p2);
        p2.brand = "小米";
        p2.price = 3999;

        System.out.println(p1.brand);
        System.out.println(p1.price);
        System.out.println(p2.brand);
        System.out.println(p2.price);
    }
}
