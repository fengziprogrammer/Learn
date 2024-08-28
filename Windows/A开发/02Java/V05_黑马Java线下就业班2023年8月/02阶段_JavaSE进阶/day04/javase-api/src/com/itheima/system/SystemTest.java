package com.itheima.system;

public class SystemTest {
    //演示：System类的使用
    public static void main(String[] args) {
        //要知道方法执行多长时间（毫秒）

        //在方法执行前：获取毫秒值
        long beginTime = System.currentTimeMillis();//获取当前系统时间的毫秒值

        method();

        //在方法执行后：获取毫秒值
        long endTime = System.currentTimeMillis();

        System.out.println("方法执行时间：" + (endTime - beginTime) + "毫秒");


        System.exit(0);
    }


    public static void method() {
        int count = 0;
        for (int i = 0; i < 10000000; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
    }
}
