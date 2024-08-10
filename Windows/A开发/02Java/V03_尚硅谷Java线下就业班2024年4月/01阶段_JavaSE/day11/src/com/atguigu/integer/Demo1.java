package com.atguigu.integer;

import java.util.ArrayList;

public class Demo1 {

    /*
        数据类型
            引用数据类型
                String 数组 类类型
            基本数据类型
                四类八种
                不足
                    1> 要对基本数据类型做一些操作  基本数据类型不能直接调用方法
                        定义一个方法  功能(将一个十进制-> 二进制)
                    2> 有些功能 参数 只能是引用数据类型
                    list.add(Object obj)
           包装类 针对基本数据类型   包装 -> 引用数据类型

           自动装箱和自动拆箱
            装箱   基本数据类型 -> 对应的包装类
            拆箱   包装类 -> 对应的基本数据类型



     */
    public static void main(String[] args) {

        /*int num = 3;
        Integer i = num;
        String s = Integer.toBinaryString(3);
        System.out.println(s);

        ArrayList list  = new ArrayList();
        list.add(i);
        System.out.println(list);*/

        Integer i = 3;// 内含了自动装箱
        System.out.println(i + 5);// 内含了自动拆箱


    }
}
