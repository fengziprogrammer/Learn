package com.atguigu.test;

public class Demo2 {

    /*
    数据的值传递特点
        一个数据,当做参数传递后,它的值是否会发生改变

        结论
            基本数据类型 存储的值  当做参数传递后,值不变
            引用数据类型 存储的引用地址值 当做参数传递后,引用地址值不变,属性值发生了变化

            String 是特殊的  值传递的结果与基本数据类型一致  不可变
     */
    public static void main(String[] args) {

        int value1 = 10;
        double value2 = 10.0;
        int [] value3 = {1,2,3,4,5};
        String value4 = "10";

        method(value1,value2,value3,value4);

        System.out.println(value1);//不变
        System.out.println(value2);//不变
        Demo1.printArr(value3);//变化
        System.out.println(value4);//不变

    }

    private static void method(int value1, double value2, int[] value3, String value4) {

        value1 += 10;
        value2 += 10;

        for (int i = 0;i <= value3.length-1;i++){
            value3[i] += 10;
        }
        value4 += 10;
    }


}
