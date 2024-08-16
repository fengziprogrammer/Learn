package com.itheima.interface_app.demo;

/**
 * @BelongsProject: javase-oop
 * @BelongsPackage: com.itheima.interface_app.demo
 * @Auther: Double 17839227351@163.com
 * @Date: 2022/10/29 15 19
 * @Since JDK 17.0
 * @Description
 */
public class Phone implements Player{
    @Override
    public void play() {
        System.out.println("手机播放");
    }

    @Override
    public void pause() {
        System.out.println("手机暂停");
    }

    @Override
    public void stop() {
        System.out.println("手机停止");
    }
}
