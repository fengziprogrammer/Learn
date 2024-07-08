package com.itheima;

/*
    案例: 带返回值方法练习
        需求1: 定义方法isEvenNumber, 接收一个整数, 判断是否是偶数, 返回boolean
        需求2: 定义方法getMax, 接收两个整数,判断较大值, 并返回
        测试两个方法
 */
public class Demo05 {

    public static void main(String[] args) {
        //3.测试方法
        int max = getMax(100,20);
        System.out.println("max:" + max); //后续操作: 打印

        boolean result = isEvenNumber(11);
        if(result == true){
            //如果返回的是true,证明是一个偶数
            System.out.println("偶数");
        } else {
            System.out.println("奇数");
        }
    }

    //1. 定义方法: 接收两个整数,判断较大值,并返回
    //返回值类型:int 参数列表:int a,int b
    public static int getMax(int a,int b){
        //判断较大值,并返回
        if(a > b){
            return a;
        }else {
            return b;
        }
    }

    //2. 定义方法: 接收一个整数,判断是否是偶数,返回boolean结果
    //返回值类型:boolean 参数列表:int num
    public static boolean isEvenNumber(int num){
        //判断是否是偶数,返回boolean结果
        if(num % 2 == 0){
            //是偶数返回true
            return true;
        }else {
            return false;
        }
    }

}
