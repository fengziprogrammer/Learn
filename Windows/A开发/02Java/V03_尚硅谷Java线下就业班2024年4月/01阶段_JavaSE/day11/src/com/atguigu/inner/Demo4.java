package com.atguigu.inner;

public class Demo4 {

    /*
    真实开发中 匿名内部类的用法
        new Thread()  代表该类的实例
        new Thread(){}  代表该类的子类实例

        局部内部类访问局部变量  该局部变量必须使用final修饰
            JDK1.7之后 自动加上final
     */
    public static void main(String[] args) {

        // 开启线程 完成任务
       /* MyThread mt = new MyThread();
        mt.start();*/

        /*new Thread(){
            @Override
            public void run() {
                System.out.println("222222222");
            }
        }.start();*/

       /* Thread thread = new Thread(new MyRunnable());
        thread.start();*/

        int num = 3;

        Thread thread = new Thread(new Runnable(){
            @Override
            public void run() {
                //num = 5;// 改变了自动加了final
                System.out.println("4444444444");
            }
        });

        num = 5;

        thread.start();
    }
}

/*class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("33333333");
    }
}*/

class MyThread extends Thread{

    // 设置任务
    @Override
    public void run() {
        System.out.println("11111111111");
    }
}
