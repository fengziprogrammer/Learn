package com.atguigu.homework;

public class Homework1 {

    /*
    需求:使用Java语言模拟以下场景
        学校附近来了一个马戏团(Circus),热闹非凡,刚才给附近的居民发了表演节目单,
        节目单有两个表演的节目:
        1.表演(老虎钻火圈)
            提示:真正表演的是老虎,老虎作为参数,调用老虎自己表演的功能
        2.表演(小熊骑单车)
            提示:真正表演的是小熊,小熊作为参数,调用小熊自己表演的功能

         事物
            马戏团
                表演(老虎){ 老虎表演钻火圈}
                表演(小熊){小熊表演骑单车}
            老虎
                老虎表演钻火圈
            小熊
                小熊表演骑单车

           新增节目单
             小猫钓鱼 小狗抓老鼠
           继续新增
             乌鸦坐飞机,小鸡炖蘑菇 ,小猪上树...... 50个节目
     */
    public static void main(String[] args) {
        Circus circus = new Circus();

        Tiger tiger = new Tiger();

        circus.perfrom(tiger);// 实参给形参赋值  CircusAnimal ca  = new Tiger();
        circus.perfrom(new Bear());// CircusAnimal ca  = new Bear();
        circus.perfrom(new Cat());
        circus.perfrom(new Dog());
        // circus.perfrom(new CircusAnimal());
    }
}



