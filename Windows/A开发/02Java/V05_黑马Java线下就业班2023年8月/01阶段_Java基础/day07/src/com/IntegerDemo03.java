package com;
/*
    自动拆装箱
        自动装箱: 基本类型 -> 包装类
        自动拆箱: 包装类 -> 基本类型
 */
public class IntegerDemo03 {
    public static void main(String[] args) {
        //自动装箱: 基本类型 -> 包装类
        Integer i = 100; //底层自动调用valueOf()

        //自动拆箱: 包装类 -> 基本类型
        int ii = i; //底层自动调用intValue()

        /*
            分析案例
         */
        Integer in = 200;
        in += 100;
        //in = in + 100;
        //in = in.intValue() + 100; //自动拆箱
        //in = 300; //自动装箱
    }
}
