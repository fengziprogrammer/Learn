package com.atguigu.c_debug;

public class Test02 {
    public static void main(String[] args) {
        method01();//无参无返回值方法
        method02(10,20);//有参无返回值方法
        int result = method03();//无参有返回值方法
        int result02 = method04(10,20);//有参有返回值方法
    }

    private static int method04(int a, int b) {
        return a+b;
    }

    private static int method03() {
        return 1;
    }

    private static void method02(int a, int b) {
        System.out.println("有参无返回值方法");
    }

    public static void method01() {
        System.out.println("无参无返回值方法");
    }
}
