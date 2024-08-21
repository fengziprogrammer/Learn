package com.itheima.polymorphic.demo4;

//MP4实现接口中的规则
public class MP4 implements Player {

    public void play(){
        System.out.println("MP4 播放音乐");
    }

    public void pause(){
        System.out.println("MP4 暂停音乐播放");
    }

    public void stop(){
        System.out.println("MP4 停止播放音乐");
    }
}
