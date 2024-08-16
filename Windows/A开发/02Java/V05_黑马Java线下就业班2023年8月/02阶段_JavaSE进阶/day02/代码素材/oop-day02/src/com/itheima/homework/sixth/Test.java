package com.itheima.homework.sixth;

/**
 * @BelongsProject: javase-oop
 * @BelongsPackage: com.itheima.homework.sixth
 * @Auther: Double 17839227351@163.com
 * @Date: 2022/10/29 19 11
 * @Since JDK 17.0
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        Student stu1 = new Student("小明",18,Sex.男);
        Student stu2 = new Student("小红",19,Sex.女);
        System.out.println(stu1.toString());
        System.out.println(stu2.toString());
    }
}
