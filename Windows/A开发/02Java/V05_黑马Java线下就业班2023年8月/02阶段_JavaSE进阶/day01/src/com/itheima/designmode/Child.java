package com.itheima.designmode;

public class Child extends Demo{
    //把父类中的抽象方法重写
    @Override
    public void context() {
        System.out.println("那是一个秋天 , 风儿那么缠绵 ,记忆中,那天爸爸骑车送我放学回家 , 我的脚卡在了自行车链中 , 爸爸蹬不动, 他就站起来蹬!");
    }
}
