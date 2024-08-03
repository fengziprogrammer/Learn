package com.atguigu.test;

public class Demo2 {

    public static void main(String[] args) {

         /*WLYX yx = new WLYX();
         yx.充值();*/
        WLYX yx = new YS();
        yx.联网();
        yx.选角色();
        yx.充值();
        yx.玩家学历小学以上();
        yx.玩家是成年人();

    }
}

abstract class WLYX{

    public abstract void 联网();
    public abstract void 选角色();
    public void 充值(){
        System.out.println("aaaaaaaaa");
    }
    public void 玩家学历小学以上(){}
    public abstract void 玩家是成年人();

}

class YS  extends WLYX{
    @Override
    public void 联网() {
        System.out.println("WIFI");
    }

    @Override
    public void 选角色() {
        System.out.println("可莉/七七/钟离");
    }

    @Override
    public void 玩家是成年人() {
        System.out.println("--------年满18");
    }



}
