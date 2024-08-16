package com.itheima.interface_app.demo;

/**
 * @BelongsProject: javase-oop
 * @BelongsPackage: com.itheima.interface_app.demo
 * @Auther: Double 17839227351@163.com
 * @Date: 2022/10/29 15 17
 * @Since JDK 17.0
 * @Description
 */
public class MP3 implements Player{
    @Override
    public void play() {
        System.out.println("MP3播放音乐");
    }

    @Override
    public void pause() {
        System.out.println("MP3暂停播放音乐");
    }

    @Override
    public void stop() {
        System.out.println("MP3停止播放音乐");
    }
}
