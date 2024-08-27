package com.atguigu.a_integer;

public class Demo01Integer {
    public static void main(String[] args) {
        //Integer(int value)
        Integer i1 = new Integer(100);
        System.out.println("i1 = " + i1);
        //Integer(String s)  -> s必须要是数字形式
        Integer i2 = new Integer("1");
        System.out.println("i2 = " + i2);

        System.out.println("=================");

        Boolean b1 = new Boolean(true);
        System.out.println("b1 = " + b1);

        Boolean b2 = new Boolean(false);
        System.out.println("b2 = " + b2);

        System.out.println("================");
        Boolean b3 = new Boolean("true");
        System.out.println("b3 = " + b3);
        Boolean b4 = new Boolean("false");
        System.out.println("b4 = " + b4);

        System.out.println("=================");

        /*
          创建 Boolean对象时,如果传递的是字符串的true,底层会比较
          字符串内容,比较的过程中是忽略大小写的
         */
        Boolean b5 = new Boolean("TrUe");
        System.out.println("b5 = " + b5);

        /*
          除了true之外其他都是false
         */
        Boolean b6 = new Boolean("FalsE");
        System.out.println("b6 = " + b6);

    }
}
