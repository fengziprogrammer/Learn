package com.atguigu.exer.method;

/*
（1）声明一个MyInt类，
- 包含一个int类型的value属性
- 包含一个方法boolean isNatural()方法，用于判断value属性值是否是自然数。自然数是大于等于0的整数。
- 包含一个方法int approximateNumberCount()方法，用于返回value属性值的约数个数。在[1, value]之间可以把value整除的整数都是value的约数。
- 包含一个方法boolean isPrimeNumber()方法，用于判断value属性值是否是素数。如果value值在[1, value]之间只有1和value本身两个约数，并且value是大于1的自然数，那么value就是素数。
- 包含一个方法int[] getAllPrimeNumber()方法，用于返回value属性值的所有约数。返回[1, value]之间可以把value整除的所有整数。
（2）测试类的main中调用测
 */
public class MethodExer3 {
    public static void main(String[] args) {
        //先创建MyInt的对象
        MyInt my = new MyInt();
        my.value = 9;

        //调用方法
        System.out.println(my.value +"是自然数吗：" + my.isNatural());
        System.out.println(my.value +"约数的个数：" + my.approximateNumberCount());
        System.out.println(my.value +"是素数吗： " + my.isPrimeNumber());
        System.out.println(my.value +"的所有约数是：" + my.getAllPrimeNumber());
        int[] allPrimeNumber = my.getAllPrimeNumber();//用一个数组类型的变量，接收数组的首地址
        for (int i = 0; i < allPrimeNumber.length; i++) {
            System.out.println(allPrimeNumber[i]);
        }
    }
}
