package com.itheima;

/*
    案例: for循环案例7 (逢七过)
        在整数1到1000中,个位不能是7,十位不能是7,并且该数不能是7的倍数
        打印满足条件的数据

    扩展: 一行打印5个,使用空格分开
        System.out.println(); //打印并换行
        System.out.print(); //一行打印
 */
public class Demo07 {
    public static void main(String[] args) {
        //定义计数器
        int count = 0;
        //for循环获取1到100的所有整数
        for (int i = 1; i <= 1000; i++) {
            //数值拆分
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;
            //判断条件
            if (ge != 7 && shi != 7 && bai != 7 && i % 7 != 0) {
                //一行打印
                System.out.print(i + " ");
                //先计数
                count++;
                //判断如果count是5的倍数, 执行换行
                if (count % 5 == 0) {
                    System.out.println();
                }
            }
        }
    }
}
