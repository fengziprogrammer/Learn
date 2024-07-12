package com.itheima;

/*
    测试类
        提供main方法
        创建对象
        赋值,打印值
        调用方法,查看结果
 */
public class PhoneTest {
    public static void main(String[] args) {
        //创建手机对象
        Phone p = new Phone();
        //打印对象名
        System.out.println(p); //com.itheima.Phone@7ef20235

        //打印属性默认值
        System.out.println(p.getBrand());
        System.out.println(p.getPrice());

        //赋值,打印值
        p.setBrand("华为");
        p.setPrice(1000);
        System.out.println(p.getBrand());
        System.out.println(p.getPrice());

        //调用方法,查看结果
        p.call("吴彦祖");
        p.sendMessage();
    }
}
