package com.itheima;

/*
    案例: 方法练习4(水仙花)
        设计方法,判断一个整数是否是水仙花数,调用测试
 */
public class Demo09 {
    public static void main(String[] args) {
        //调用方法
        System.out.println(isFlower(371));
        System.out.println(isFlower(666));

        //思考: 怎么样避免传递的错误数据(不是三位数)?
        System.out.println(isFlower(10000));
    }

    public static boolean isFlower(int num) {
        //判断num的合法性
        if(num < 100 || num > 999){
            System.out.print("输入的数据不是三位数!");
            return false;
        }

        //数值拆分
        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 100;
        //判断,并返回结果
        if (ge * ge * ge + shi * shi * shi + bai * bai * bai == num) {
            return true;
        } else {
            return false;
        }
    }
}
