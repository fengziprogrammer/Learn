package com.atguigu.c_method;

public class Demo03Method {
    public static void main(String[] args) {
        //打印调用
        System.out.println(sum());

        //赋值调用-> 建议使用
        int result = sum();
        System.out.println("result = " + result);
        if (result>100){
            System.out.println("结果大于100");
        }else{
            System.out.println("结果小于100");
        }
    }

    public static int sum(){
        int a = 10;
        int b = 20;
        int sum = a+b;
        return sum;//30
    }
}
