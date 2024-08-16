package com.itheima.homework.second;

/**
 * @BelongsProject: javase-oop
 * @BelongsPackage: com.itheima.homework.second
 * @Auther: Double 17839227351@163.com
 * @Date: 2022/10/29 18 47
 * @Since JDK 17.0
 * @Description
 */
public class UITeacher extends Worker implements Draw{


    @Override
    public void work() {
        System.out.println("讲授UI");
    }

    @Override
    public void draw() {
        System.out.println("UI老师会画画");
    }
}
