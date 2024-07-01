package com.itheima;

/*
    案例 (需求):
        定义变量, 进行手机信息描述, 打印结果
            品牌 brand
            型号 type
            内存 memory
            颜色 color
            价格 price
 */
public class Demo02 {
    public static void main(String[] args) {
        //定义变量, 进行手机信息描述
        String brand = "华为";
        String type = "Mate 40";
        int memory = 256; //单位G
        String color = "亮黑色";
        double price = 3098.0;
        //双11做活动价格打折, 修改变量
        price = 1999.0;

        //操作变量, 打印
        System.out.println("品牌: " + brand);
        System.out.println("类型: " + type);
        System.out.println("内存: " + memory);
        System.out.println("颜色: " + color);
        System.out.println("价格: " + price); //1999.0
    }
}