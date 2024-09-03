package com.itheima.api_demo.system_demo;

import java.util.Date;

/*
    System类 :
        public static void exit(int status): 	终止当前运行的 Java 虚拟机，非零表示异常终止
        public static long currentTimeMillis()	返回当前时间(以毫秒为单位)


    break       : 结束的switch或者循环语句
    return      : 结束方法
    System.exit(0)  : 终止虚拟机
 */
public class SystemDemo {
    public static void main(String[] args) {
        //  public static void exit(int status): 	终止当前运行的 Java 虚拟机，非零表示异常终止
        //  System.exit(0);

//        show();
//        System.out.println("方法结束...");

        String s = "";

        StringBuilder sb = new StringBuilder();

        //  public static long currentTimeMillis()	返回当前时间(以毫秒为单位)
        long start = System.currentTimeMillis();

//        for (int i = 0; i < 100000; i++) {
//            s += i;
//        }
//        System.out.println(s);

        for (int i = 0; i < 100000; i++) {
            sb.append(i);
        }
        System.out.println(sb);

        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }

    public static void show() {
        for (int i = 1; i <= 10; i++) {
            if (i == 3) {
                // break;
                // return;
                System.exit(0);
            }
            System.out.println("hello");
        }

        System.out.println("循环结束...");
    }
}
