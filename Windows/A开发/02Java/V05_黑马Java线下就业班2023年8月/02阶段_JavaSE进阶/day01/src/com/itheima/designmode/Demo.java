package com.itheima.designmode;

public abstract class Demo {

    //写作文
    public void writeComposition() {
        //头
        head();

        //正文
        context();

        //尾
        end();
    }

    //作文正文
    public abstract void context();


    private void head() {
        System.out.println("《我的爸爸》");
    }

    private void end() {
        System.out.println("啊~ 这就是我的爸爸");
    }


}
