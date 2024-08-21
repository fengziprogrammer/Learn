package com.itheima.polymorphic.demo4;

public class MP3 implements Player {

    public void play(){
        System.out.println("mp3播放音乐");
    }

    public void pause(){
        System.out.println("mp3暂停音乐播放");
    }

    public void stop(){
        System.out.println("mp3停止播放音乐");
    }
}
