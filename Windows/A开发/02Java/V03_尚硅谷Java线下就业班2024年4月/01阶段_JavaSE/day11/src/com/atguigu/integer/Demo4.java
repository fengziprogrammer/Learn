package com.atguigu.integer;

public class Demo4 {

    /*
    Integer面试题

        结论
            直接赋值 方式 Integer i = 值;
            规律 值在-128-127  true  同一个地址
            否则 false  不在同一个地址
         原理
            public static Integer valueOf(int i) {
            if (i >= IntegerCache.low && i <= IntegerCache.high)
                return IntegerCache.cache[i + (-IntegerCache.low)];
            return new Integer(i);

            i 在 [-128,127]  对象直接从缓冲区中 获取  同一个地址
            否则 new Integer(i)  返回的不是同一个地址
    }
     */
    public static void main(String[] args) {

        Integer i1 = new Integer(127);
        Integer i2 = new Integer(127);
        System.out.println(i1 == i2);//? 地址值
        System.out.println(i1.equals(i2));//?属性值
        System.out.println("-------------");

        Integer i3 = new Integer(138);
        Integer i4 = new Integer(138);
        System.out.println(i3 == i4);//?
        System.out.println(i3.equals(i4));//? t
        System.out.println("-------------");

        Integer i7 = 127;
        Integer i8 = 127;
        System.out.println(i7 == i8);//
        System.out.println(i7.equals(i8));//?
        System.out.println("-------------");

        Integer i9 = -129;
        Integer i10 = -129;
        System.out.println(i9 == i10);
        System.out.println(i9.equals(i10));//
    }
}
