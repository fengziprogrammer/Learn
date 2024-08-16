package com.itheima.interface_app.demo3;

public class Test1 {
    public static void main(String[] args) {
        //创建手机
        Phone phone  = new Phone();
        phone.play();
        phone.pause();
        phone.stop();

        //创建Mp4
        MP4 mp4 =new MP4();
        demo(mp4);

        //创建Mp4
        MP3 mp3 =new MP3();
        demo(mp3);
    }

    public static void demo(Player p){
        p.play();
        p.pause();
        p.stop();
    }
}
