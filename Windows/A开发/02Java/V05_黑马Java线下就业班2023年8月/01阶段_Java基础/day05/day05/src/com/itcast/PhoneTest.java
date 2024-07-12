package com.itcast;

/*
    手机测试类
 */
public class PhoneTest {
    public static void main(String[] args) {
        //创建对象1: 空参+set
        Phone p1 = new Phone();
        p1.setBrand("华为");
        p1.setPrice(4999);
        System.out.println(p1.getBrand() + "," + p1.getPrice());
        p1.call("蔡依林");

        System.out.println("---------------------");

        //创建对象2: 带参
        Phone p2 = new Phone("锤子手机",1500.5);
        System.out.println(p2.getBrand() + "," + p2.getPrice());
        p2.call("周杰伦");
    }
}
