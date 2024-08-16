package com.itheima.interface_app.demo3;

public class Phone implements Player {

    public void play(){
        System.out.println("手机 播放音乐");
    }

    public void pause(){
        System.out.println("手机 暂停音乐播放");
    }

    public void stop(){
        System.out.println("手机 停止播放音乐");
    }
}
