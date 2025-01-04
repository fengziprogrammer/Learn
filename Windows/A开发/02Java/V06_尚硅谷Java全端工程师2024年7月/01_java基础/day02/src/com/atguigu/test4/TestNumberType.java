package com.atguigu.test4;

/**
 * @author WHD
 * @description TODO
 * @date 2023/7/26 15:47
 *  整数类型四种
 *  byte    1个字节8位 -128 ~ 127
 *  short   2个字节16位 -32768 ~ 32767
 *  int     4个字节32位 -2147483648 ~ 2147483647
 *  long    8个字节64位
 *
 *  Java中的每一个数据都有其对应的数据类型
 *  整数对应int类型
 *
 *
 */
public class TestNumberType {
    public static void main(String[] args) {
        byte b1 = 100;
        System.out.println("b1的取值为：" + b1); // sout 回车 自动生成输出语句

        byte b2 = -123;
        System.out.println("b2 = " + b2); // soutv 自动生成打印上一行变量的输出语句

//        byte b3 = -129;
//        System.out.println("b3 = " + b3);

        System.out.println("----------------------------------------------");

        short s1 = 8956;
        System.out.println("s1 = " + s1);

        short s2 = -23451;
        System.out.println("s2 = " + s2);

//        short s3 = -32769;
        System.out.println("----------------------------------------------");

        int i1 = 895645;
        System.out.println("i1 = " + i1);

        int i2 = -561245;
        System.out.println("i2 = " + i2);

//        int i3 = 2147483648;

        System.out.println("----------------------------------------------");

        // int为整数的默认类型，如需为long类型赋值
        // 如果取值范围超出了int 则需要在值的后面追加“L”
        // 如果取值范围在int范围以内 则可加 可不加
        long l1 = 567854651;
        System.out.println("l1 = " + l1);

        long l2 = -45127856;
        System.out.println("l2 = " + l2);

        long l3 = 2147483648L;
        System.out.println("l3 = " + l3);

        long l4 = 100;







    }
}
