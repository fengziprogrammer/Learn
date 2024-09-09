package com.itheima.collection_demo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
     方法的调用
        1 首先看方法的是否被static修饰
            如果是一个static修饰的方法 , 那么类名调用
            如果方法没有static修饰 , 只能通过对象调用

        2 看方法名 , 看方法的参数列表
            参数列表 : 此方法要几个参数就需要传入几个参数 , 要什么类型就需要传入什么类型

        3 看方法的返回值类型
            用void修饰的方法
                只能直接调用 : 方法名(...)
            有具体返回值的方法(无void修饰)
                1 直接调用 : 方法名(...)  对于大部分方法来说没有意义
                2 赋值调用 : 数据类型 变量名 = 方法名(...)
                3 输出调用 : System.out.println(方法名(...));

 */
public class MethodDemo {
    public static void main(String[] args) throws IOException {

    }
}
