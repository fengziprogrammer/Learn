package com.atguigu.a_integer;

public class Demo03Integer {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf("1000");
        //拆箱->将包装类转成基本类型
        int i = i1.intValue();
        System.out.println(i+1);
    }
}
