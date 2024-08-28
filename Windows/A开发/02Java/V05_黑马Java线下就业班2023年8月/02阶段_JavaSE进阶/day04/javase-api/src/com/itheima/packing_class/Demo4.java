package com.itheima.packing_class;

public class Demo4 {
    public static void main(String[] args) {
        //定义包装类对象（包装类底层使用了：享元设计模式）
        Integer num1 = 100;//整数只在要：-128~127 范围内， 就会直接从常量池中获取对象
        Integer num2 = 100;

        System.out.println(num1 == num2);
    }
}
