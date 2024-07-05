package com.itheima;

/*
    案例: for循环案例3(求偶数和)
        求1到100之间的偶数和
 */
public class Demo03 {
    public static void main(String[] args) {
        //定义求和变量
        int sum = 0;
        //获取1到100之间所有整数
        for (int i = 1; i <= 100; i++) {
            //判断当前整数是不是偶数
            if (i % 2 == 0) {
                //累加
                sum += i;
            }
        }
        //循环结束,打印结果
        System.out.println("sum:" + sum); //2550
    }
}
