package com.itheima.homework.second;

import javax.swing.*;

/**
 * @BelongsProject: javase-oop
 * @BelongsPackage: com.itheima.homework.second
 * @Auther: Double 17839227351@163.com
 * @Date: 2022/10/29 18 48
 * @Since JDK 17.0
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        JavaTeacher jt = new JavaTeacher();
        jt.setName("小明");
        jt.setSex("男");
        jt.setAge(25);
        System.out.println(jt.toString());
        jt.work();
        UITeacher ut = new UITeacher();
        ut.setName("小红");
        ut.setSex("女");
        ut.setAge(18);
        System.out.println(ut.toString());
        ut.work();
        ut.draw();
    }
}
