package com.itheima;

/*
    格式3:

    案例: 交通信号灯
 */
public class Demo06 {
    public static void main(String[] args) {
        int l = 1; //红灯
        //l = 2; //绿灯
        //l = 3; //黄灯
        //l = 4; //出现故障

        //根据l的值不同,打印不同结果
        if (l == 1) {
            System.out.println("红灯停");
        } else if (l == 2) {
            System.out.println("绿灯行");
        } else if (l == 3) {
            System.out.println("黄灯注意");
        } else if(l == 4){
            System.out.println("故障");
        }
    }
}
