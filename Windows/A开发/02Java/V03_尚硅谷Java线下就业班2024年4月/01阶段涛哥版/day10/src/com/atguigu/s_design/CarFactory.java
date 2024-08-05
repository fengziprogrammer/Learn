package com.atguigu.s_design;

public class CarFactory {
    public static Car createCar(String name){
        /*
           字符串不能用==比较

           boolean equals(Object obj) -> 比较字符串内容
           boolean equalsIgnoreCase(String s) -> 比较字符串内容,但是忽略大小写
         */
        if ("benz".equalsIgnoreCase(name)){
            return new Benz();
        }
        if ("bmw".equalsIgnoreCase(name)){
            return new Bmw();
        }

        return null;
    }
}
