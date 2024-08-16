package com.itheima.interface_app.demo3;

/**
 * @BelongsProject: javase-oop
 * @BelongsPackage: com.itheima.interface_app.demo3
 * @Auther: Double 17839227351@163.com
 * @Date: 2022/10/29 17 34
 * @Since JDK 17.0
 * @Description
 */
public class TrafficTest {
    public static void main(String[] args) {
        change(Signal.GREEN);
    }

    public static void change(Signal signal){
        switch(signal){
            case Red:
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
}
