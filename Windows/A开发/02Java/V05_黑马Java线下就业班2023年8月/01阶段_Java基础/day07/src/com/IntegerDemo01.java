package com;
/*
    基本类型包装类?
        将基本类型封装成对象, 好处是提供了方法操作数据
        除了int是Integer, char是Character
        其余都是首字母大写
            byte -> Byte
            short -> Short
            * int -> Integer
            long -> Long
            float -> Float
            double -> Double
            * char -> Character
            boolean -> Boolean

    包装类常见操作?
        用于基本数据类型与字符串(引用)之间的转换

    Integer构造方法(过时)
        Integer(int value);
        Integer(String str);

     Integer构造方法(推荐)
        static Integer valueOf(int value); 返回指定int值的Integer对象
        static Integer valueOf(String str); 返回指定String值的Integer对象

 */
public class IntegerDemo01 {
    public static void main(String[] args) {
        /*
            Integer构造方法(过时)
         */
//        //Integer(int value);
//        Integer i1 = new Integer(100);
//        System.out.println(i1);
//
//        //Integer(String str);
//        Integer i2 = new Integer("200");
//        System.out.println(i2);

        /*
            Integer静态方法(推荐)
                valueOf(基本类型/字符串)
         */
        //static Integer valueOf(int value); 返回指定int值的Integer对象
        Integer i1 = Integer.valueOf(100);
        System.out.println(i1); //i1是对象,可以调用方法

        //static Integer valueOf(String str); 返回指定String值的Integer对象
        Integer i2 = Integer.valueOf("200");
        System.out.println(i2); //i2是对象,可以调用方法

        //Integer i3 = Integer.valueOf("100a"); //要传递纯数值, 不能够完成转换的!!! 报错
        //System.out.println(i3);
    }
}
