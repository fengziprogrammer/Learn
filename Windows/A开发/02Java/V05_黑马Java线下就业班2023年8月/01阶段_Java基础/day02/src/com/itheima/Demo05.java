package com.itheima;

/*
    格式1/2:

    if(关系表达式){
        语句体;
    }

    流程:
        1.判断关系表达式的结果
        2.如果结果成立, 执行语句体, 继续执行其他语句
        3.如果不成立, 绕过if, 继续执行其他语句

    常见问题
        if语句的小括号后面,不要写分号!!
        如果if语句管理的语句体只有一条,那么可以省略大括号不写,不建议!!
 */
public class Demo05 {
    public static void main(String[] args) {
        System.out.println("程序开始");

        //定义变量,记录年龄
        int age = 17;
        age = 18;

        //判断是否能进网吧, 条件需要一个关系表达式
        if(age >= 18) {
            System.out.println("可以上网");
        } else {
            System.out.println("不可以上网!");
        }

        System.out.println("程序结束");
    }
}
