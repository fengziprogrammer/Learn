package com.atguigu.homework;

/*
节目单有两个表演的节目:
        1.表演(老虎钻火圈)
            提示:真正表演的是老虎,老虎作为参数,调用老虎自己表演的功能
        2.表演(小熊骑单车)
            提示:真正表演的是小熊,小熊作为参数,调用小熊自己表演的功能

            优化
                使用多态对其进行优化
            原理
                里氏替换原则 :父类适用的子类一定适用
                当前的应用
                    将父类当做参数,可以接受它的任意子类对象

 */
public class Circus {

    public void perfrom(CircusAnimal ca){// ca = new  Tiger();
        ca.perfrom();

    }

   /* // 表演(老虎钻火圈)
    public void perfrom(Tiger tiger){
        tiger.perfrom();
    }

    // 表演(小熊骑单车)
    public void perfrom(Bear bear){
        bear.perfrom();
    }

    public void perfrom(Cat cat){
        cat.perfrom();
    }

    public void perfrom(Dog dog){
        dog.perfrom();
    }

    //... 50个对应的节目单*/

}
