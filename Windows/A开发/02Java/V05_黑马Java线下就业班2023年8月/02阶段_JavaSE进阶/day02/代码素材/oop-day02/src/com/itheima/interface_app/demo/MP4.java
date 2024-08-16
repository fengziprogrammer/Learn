package com.itheima.interface_app.demo;

/**
 * @BelongsProject: javase-oop
 * @BelongsPackage: com.itheima.interface_app.demo
 * @Auther: Double 17839227351@163.com
 * @Date: 2022/10/29 15 18
 * @Since JDK 17.0
 * @Description
 */
public class MP4 implements Player{
    @Override
    public void play() {
        System.out.println("MP4播放电影");
    }

    @Override
    public void pause() {
        System.out.println("MP4暂停播放电影");
    }

    @Override
    public void stop() {
        System.out.println("MP4停止播放电影");

    }
}
