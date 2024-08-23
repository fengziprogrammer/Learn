package com.itheima.code_block.local_demo;
/*
    定义位置 : 任何局部代码位置都可以定义局部代码块 ，就是一对大括号。

    作用 : 可以限定变量的作用域 , 在代码块执行完毕, 及时释放内存
 */
public class Demo {
    public static void main(String[] args) {

        // 局部代码快
        {
            int a = 10;
        }
        int a = 10;
        System.out.println(a);
    }
}
