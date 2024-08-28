package com.itheima.packing_class;

public class Test1 {
    //演示：自动装箱、自动拆箱
    public static void main(String[] args) {
        Integer num1=100;

        int result = num1;

        System.out.println(result);


        //以下代码存在：先进行自动拆箱、再进行自动装箱
        Integer result2 = num1+10; // Integer result2 = Integer.valueOf(num1.intValue()+10)
    }
}
