package com.atguigu.f_object;

public class Test01 {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        System.out.println(phone1);//地址值
        System.out.println(phone1.brand);
        System.out.println(phone1.price);
        phone1.brand = "诺基亚";
        phone1.price = 150;
        System.out.println(phone1.brand);
        System.out.println(phone1.price);
        phone1.call();
        phone1.message();
    }
}
