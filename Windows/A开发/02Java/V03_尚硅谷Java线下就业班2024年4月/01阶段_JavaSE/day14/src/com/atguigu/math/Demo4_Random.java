package com.atguigu.math;

import java.util.Date;
import java.util.Random;

public class Demo4_Random {

    /*
    Random
        依据种子经过一系列固定的运算 --> 伪随机数流
        空参构造 默认的种子  是当前时间对应的毫秒值
    构造
        - public Random()
        - public Random(long seed)//参数为种子

        - public int nextInt()
		返回下一个伪随机数，它是此随机数生成器的序列中均匀分布的 int 值。
        - public int nextInt(int n)(重点掌握)  返回结果[0,n)
		返回一个伪随机数，它是取自此随机数生成器序列的、在 0（包括）和指定值（不包括）之间均匀分布的 int 值。

     */
    public static void main(String[] args) {

        // Random r = new Random();
        Random r = new Random(66);

        System.out.println(new Date().getTime());// 当前时间对应的毫秒值

        for (int i = 0; i < 10; i++) {
            System.out.println(r.nextInt());//
            // System.out.println(r.nextInt(10));//[0,10)
        }

        System.out.println();

    }
}
