package com.itheima.polymorphic.demo4;

public class Test {
    public static void main(String[] args) {
        //创建MP3对象
        MP3 mp3 = new MP3();//mp3 = 子类对象
        method(mp3);
        System.out.println("----------------------------");

        //创建MP4匿名对象，作为参数传递
        method( new MP4() ); //匿名对象
        System.out.println("----------------------------");

        //创建手机
        Player phone = new Phone(); //父引用 = 子类对象
        method (  phone );
    }

    //使用多态： 提高代码复用性、 提高代码的扩展性
    public static void method(Player p){
        p.play();
        p.pause();
        p.stop();
    }

}
