package com.itheima.enum_app.base;

public class Test {
    //根据红绿灯变化，执行交通
    public static void chang(Signal color) {
        switch (color){
            case RED:
                System.out.println("红灯停");
                break;
            case GREEN:
                System.out.println("绿灯行");
                break;
            case YELLOW:
                System.out.println("黄灯等一等");
                break;
        }
    }
    public static void main(String[] args) {
        //调用静态方法
        chang(Signal.GREEN);
    }
}
