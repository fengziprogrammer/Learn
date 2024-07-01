package com.itheima;

/*
    案例: 数值拆分

        java中两个整数相除: 结果只取商
        java中两个整数取余: 结果只取余数
 */
public class Demo01 {
    public static void main(String[] args) {
        //定义变量
        int num = 345;

        //数值拆分
        int ge = num % 10; //345%10=34..5
        int shi = num / 10 % 10; //345/10=34%10=3..4
        int bai = num / 100 % 10; //345/100=3
        //int qian = num / 1000 % 10;

        //做后续操作 (打印结果)
        System.out.println("个位:" + ge);
        System.out.println("十位:" + shi);
        System.out.println("百位:" + bai);
    }
}
