package com.atguigu.exer.method;

/*
return的作用：
（1）返回结果值
（2）结束当前方法的执行
 */
public class MyInt {
    int value;

    boolean isNatural(){
        return value >= 0;//返回结果是true和false,条件表达式满足，就返回true，否则返回false
    }

    int approximateNumberCount(){
        //在[1, value]之间可以把value整除的整数都是value的约数
        int count = 0;
        for (int i = 1; i <= value ; i++) {
            if(value%i==0){
                count++;
            }
        }
        return count;
    }

    boolean isPrimeNumber(){
        //如果value值在[1, value]之间只有1和value本身两个约数，并且value是大于1的自然数，那么value就是素数。
        //value大于1，并且约数的个数只有2个
        return value >1 && approximateNumberCount()==2;
    }

    int[] getAllPrimeNumber(){
        /*
        第一步：先创建一个数组，用来装所有的约数
        约束的个数，就是approximateNumberCount()的返回值
         */
        int[] allApproximateNumber = new int[approximateNumberCount()];
        /*
        第二步：一一找这些约数，放到allApproximateNumber数组中
        在[1,value]之间找约数
         */
        for (int i=1,index=0; i<=value ; i++){
            if(value%i==0){
                allApproximateNumber[index++] = i;
            }
        }
        return allApproximateNumber;//数组名中存储的是数组的首地址
    }
}
