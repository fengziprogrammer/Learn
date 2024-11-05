package com.itheima.waitnotify_demo2;
/*
    桌子类
 */
public class Desk {
    // 食物的个数
    public static int count = 10;

    // 定义boolean类型的变量 , 记录桌子上状态
    // false 没有食物 , true  有
    public static boolean flag = false;

    // 定义唯一的锁对象
    public static final Object OBJ = new Object();
}
