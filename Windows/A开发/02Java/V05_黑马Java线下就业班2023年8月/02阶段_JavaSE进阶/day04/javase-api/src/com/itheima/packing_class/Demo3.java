package com.itheima.packing_class;

public class Demo3 {
    public static void main(String[] args) {
        //定义包装类对象
        Integer num = 10;  //底层代码格式（自动装箱）：   Integer num = Integer.valueOf(10)

        //对数值进行运算
        num = num + 20;//底层代码格式（自动拆箱）：    num.intValue() + 20

        num++;

        System.out.println(num);

    }
}
