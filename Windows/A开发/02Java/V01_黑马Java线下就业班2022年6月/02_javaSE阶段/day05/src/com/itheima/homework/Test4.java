package com.itheima.homework;

import java.util.Scanner;

/*
    键盘录入一段字符串，字符串包含一个学生的姓名，年龄，身高信息。这三个信息以中划线分隔，例如：


    "张三-18-180-false-女"


定义学生类包含属性姓名，年龄，身高，将上述字符串转换为学生对象。打印对象，将对象的属性信息显示出来。
 */
public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生信息:");
        String info = sc.nextLine(); // "张三-18-180-false-女"

        // 切割字符串
        String[] str = info.split("-");// {"张三" , "18" , "180" , "false" , "女"}

        Student s = new Student(
                str[0] ,
                Integer.parseInt(str[1]) ,
                Double.parseDouble(str[2]) ,
                Boolean.parseBoolean(str[3]) ,
                str[4].charAt(0)
        );

        System.out.println(s);
    }
}
