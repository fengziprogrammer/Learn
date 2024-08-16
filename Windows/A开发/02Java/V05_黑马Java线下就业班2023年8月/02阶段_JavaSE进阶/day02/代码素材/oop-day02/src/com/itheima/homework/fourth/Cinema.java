package com.itheima.homework.fourth;

/**
 * @BelongsProject: javase-oop
 * @BelongsPackage: com.itheima.homework.fourth
 * @Auther: Double 17839227351@163.com
 * @Date: 2022/10/29 19 02
 * @Since JDK 17.0
 * @Description
 */
public class Cinema implements Charge,Play{
    @Override
    public void charge() {
        System.out.println("解放电影院：“30元/张，凭学生证享受半价");
    }

    @Override
    public void play() {
        System.out.println("正在放映电影");
    }
}
