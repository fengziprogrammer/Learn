package com.itheima;

public class Demo10 {
    public static void main(String[] args) {
        //调用getSum, 传递参数, 接收返回值sum并打印
        int sum = getSum(10, 20);
        System.out.println("sum:" + sum);

        //调用isSame, 传递参数, 如果没有返回值则查看结果, 如果有则接收返回值并打印
        boolean result = isSame(10, 10);
        //判断返回值
        if (result) {
            System.out.println("相等");
        } else {
            System.out.println("不相等");
        }

        //调用getMax, 传递参数, 接收返回值max并打印
        int a = 10, b = 20, c = 30;
        int max = getMax(a, b, c);
        System.out.println("max:" + max);
    }

    //定义方法getSum, 获取两个整数的和
    public static int getSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    //定义方法isSame, 判断两个整数是否相等
    public static boolean isSame(int a, int b) {
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }
//    public static void isSame(int a, int b) {
//        if (a == b) {
//            System.out.println("相等");
//        } else {
//            System.out.println("不相等");
//        }
//    }

    //定义方法getMax, 判断三个整数的最大值
    public static int getMax(int a, int b, int c) {
        return (a > b ? a : b) > c ? (a > b ? a : b) : c;
    }
}
