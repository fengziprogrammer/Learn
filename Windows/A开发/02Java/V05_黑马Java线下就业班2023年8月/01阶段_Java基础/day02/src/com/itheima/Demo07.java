package com.itheima;
/*
    案例: 减肥计划, 每周7天每一天对应一个运动
 */
public class Demo07 {
    public static void main(String[] args) {
        //减肥计划 -> 每周7天每一天对应一个运动
        int week = 3; //星期3
        //week = 8; //如果接收到了错误数据, 提供else备胎语句
        if (week == 1) {
            System.out.println("星期1:打篮球");
        } else if (week == 2) {
            System.out.println("星期2:打羽毛球");
        } else if (week == 3) {
            System.out.println("星期3:游泳");
        } else if (week == 4) {
            System.out.println("星期4:爬山");
        } else if (week == 5) {
            System.out.println("星期5:汽车");
        } else if (week == 6) {
            System.out.println("星期6:休息");
        } else if (week == 7) {
            System.out.println("星期7:休息");
        } else {
            System.out.println("上述条件都不满足, 你输入的有误!");
        }
    }
}
