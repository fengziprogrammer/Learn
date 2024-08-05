package com.atguigu.a_homework;

public class KeyBoard implements USB {
    @Override
    public void open() {

        System.out.println("键盘开启");
    }

    @Override
    public void close() {

        System.out.println("键盘关闭");
    }

    //特有方法
    public void qiaoJi(){
        System.out.println("快来呀,敲死我!");
    }
}
