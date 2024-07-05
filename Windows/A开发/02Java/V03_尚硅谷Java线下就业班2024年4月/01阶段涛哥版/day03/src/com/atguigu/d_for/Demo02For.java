package com.atguigu.d_for;

public class Demo02For {
    public static void main(String[] args) {
        //1.定义一个变量sum,用于接收两个数相加之和
        int sum = 0;
        //2.利用for循环1 2 3表示出来
        for (int i = 1;i<=3;i++){
        //3.在循环体中做运算,两两相加,结果赋值给sum
            sum+=i;//sum = sum+i;
        }
        //4.输出sum
        System.out.println("sum = " + sum);
    }
}
