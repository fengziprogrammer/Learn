package com.itheima.code_block;

import java.util.ArrayList;

/* 静态代码块 :
      1 定义的位置 : 在一对大括号前加上static , 定义在类中方法外
      2 执行时机 ; 随着类的加载而执行, 只加载一次
      3 可以给类中的静态成员进行初始化数据
 */
public class StaticCode {
    //集合
    private static ArrayList<String> list = new ArrayList<String>();


    //静态代码块
    static {
        System.out.println("静态代码块~");

        //初始化数据
        list.add("Java");
        list.add("MySQL");
        list.add("Mybatis");
        list.add("html");
    }

    //获取数据
    public static String getData(int index){
        String str =list.get(index);
        return str;
    }
}
