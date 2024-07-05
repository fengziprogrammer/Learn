package com.itheima;
//11 21 33 44

/*
    案例: while循环案例2(珠峰折纸)
        已知珠峰高度为8848.86米, 纸张厚度为0.1毫米
        请问纸张对折几次, 能达到或者超过珠峰高度
 */
public class Demo09 {
    public static void main(String[] args) {
        //定义珠峰高度
        double zf = 8848.86;
        //定义纸张厚度
        double zhi = 0.0001;
        //定义计数器
        int count = 0;
        //由于不知道循环多少次 -> 优先使用while -> 分析条件判断语句 -> zhi < zf
        while (zhi < zf) {
            //折纸
            zhi *= 2;
            //计数
            count++;
        }
        //循环结束,打印结果
        System.out.println(count); //27
    }
}
