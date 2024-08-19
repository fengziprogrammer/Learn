package com.itheima.abstract_template;

public class Rose extends TemplateDemo {
    @Override
    public void body() {
        System.out.println("那是一个秋天 , 风儿那么缠绵 ,记忆中,那天爸爸骑车送我放学回家 " +
                "我的脚卡在了自行车链中 , 爸爸蹬不动, 他就站起来蹬!");
    }
}

class Tom extends TemplateDemo {
    @Override
    public void body() {
        System.out.println("tom的作文正文.....");
    }
}
