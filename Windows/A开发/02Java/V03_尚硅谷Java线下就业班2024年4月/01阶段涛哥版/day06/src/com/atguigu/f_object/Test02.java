package com.atguigu.f_object;

public class Test02 {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        System.out.println(p1);
        p1.brand = "华为";
        p1.price = 6999;
        Phone p2 = new Phone();
        System.out.println(p2);
        p2.brand = "苹果";
        p2.price = 8999;
        System.out.println(p1.brand);//华为
        System.out.println(p1.price);//6999
        System.out.println(p2.brand);//苹果
        System.out.println(p2.price);//8999
    }
}
