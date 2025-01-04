package com.atguigu.test3;

/**
 * @author WHD
 * @description TODO
 * @date 2023/7/26 14:57
 * 变量的定义
 * 三种方式
 * 方式1： 先声明 再赋值
 * 方式2： 连声明 带赋值 写为一条语句
 * 方式3： 同时声明多个同类型的变量(了解) 实际开发中不推荐使用 因为阅读性较差
 *
 * 同时注释多行代码：选中代码 ctrl + /
 * 自动对齐/格式化代码 ： ctrl + alt + L
 * 红色波浪线：鼠标移动上去 查看报错信息
 */
public class TestVariableDefine {
    public static void main(String[] args) {
        // 方式1： 先声明 再赋值
        int a;
        a = 100;
        System.out.println("变量a的取值为：" + a);

        // 方式2： 连声明 带赋值 写为一条语句
        int b = 123;
        System.out.println("变量b的取值为：" + b);

        // 方式3： 同时声明多个同类型的变量(了解)
        // 未赋值的局部变量是不能使用的
        int c, d, e = 55, f, g = 66;
        System.out.println("变量e的取值为：" + e);
        System.out.println("变量g的取值为：" + g);
//        System.out.println("变量c的取值为：" + c);
//        System.out.println("变量d的取值为：" + d);
//        System.out.println("变量f的取值为：" + f);


    }
}
