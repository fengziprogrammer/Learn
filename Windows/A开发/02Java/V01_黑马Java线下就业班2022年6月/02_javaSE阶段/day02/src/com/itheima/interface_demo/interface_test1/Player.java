package com.itheima.interface_demo.interface_test1;

// 播放接口
public interface Player {
    public abstract void play(); // 播放
    public abstract void pause();// 暂停
    public abstract void stop(); // 停止
}

class MP3 implements Player{

    @Override
    public void play() {
        System.out.println("MP3播放音乐");
    }

    @Override
    public void pause() {
        System.out.println("MP3暂停音乐");
    }

    @Override
    public void stop() {
        System.out.println("MP3停止音乐");
    }
}

class MP4 implements Player{

    @Override
    public void play() {
        System.out.println("MP4播放音乐");
    }

    @Override
    public void pause() {
        System.out.println("MP4暂停音乐");
    }

    @Override
    public void stop() {
        System.out.println("MP4停止音乐");
    }
}

class Phone implements Player{

    @Override
    public void play() {
        System.out.println("手机播放音乐");
    }

    @Override
    public void pause() {
        System.out.println("手机暂停音乐");
    }

    @Override
    public void stop() {
        System.out.println("手机停止音乐");
    }
}
