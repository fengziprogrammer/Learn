package com.itheima.changeparameter_demo;

/*
    1 什么是可变参数
        JDK5中,允许在调用方法时传入任意个参数。可变参数原理就是一个数组形式存在
        格式 : 修饰符 返回值类型 方法名(数据类型… 变量名) {  }
        举例 : public void show(int... num){}

    2 可变参数注意 :
        1) 可变参数只能作为方法的最后一个参数，但其前面可以有或没有任何其他参数。
        2) 可变参数本质上是数组，不能作为方法的重载。如果同时出现相同类型的数组和可变参数方法，是不能编译通过的。

    3 可变参数的使用 :
        调用可变参数的方法 , 可以传入0个到任意个数据 , 编译器会将可变参数转换成一个数组 , 也可以直接传递一个数组
        方法中把可变参数当做一个数组去使用即可


    练习：定义方法可以求任意个整数的和
 */
public class VariableDemo1 {
    public static void main(String[] args) {
        System.out.println(getSum());
        System.out.println(getSum(11));
        System.out.println(getSum(11, 22));
        System.out.println(getSum(11, 22, 33));
        System.out.println(getSum(new int[3]));
    }


    public static int getSum(int... num) {
        int sum = 0;// 求和变量
        for (int i : num) {
            sum += i;
        }
        return sum;
    }

    //  1) 可变参数只能作为方法的最后一个参数，但其前面可以有或没有任何其他参数。
    public static void show(double d, int... num) {

    }
    //  2) 可变参数本质上是数组，不能作为方法的重载。如果同时出现相同类型的数组和可变参数方法，是不能编译通过的。
//    public static int getSum(int[] num) {
//        return -1;
//    }
}
