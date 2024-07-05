package com.itheima;

/*
    案例: for循环案例4(水仙花数)
        水仙花数是一个三位数, 数字每个位置的立方和等于数字本身
 */
public class Demo04 {
    public static void main(String[] args) {
        //定义计数器
        int count = 0;
        //使用for循环, 获取所有三位整数
        for (int i = 100; i < 1000; i++) {
            //数值拆分, 拆循环中的变量i
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;
            //if语句判断, 条件是如果, 每个位置立方和等于数字本身
            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
                //计数
                count++;
                //打印满足条件的数字
                System.out.println(i);
            }
        }
        //循环结束,打印个数
        System.out.println("count:" + count); //4
    }
}
