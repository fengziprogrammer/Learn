package com.itheima.objects;

import java.util.Objects;

public class Test1 {
    public static void main(String[] args) {
        String s1 = null;
        String s2 = null;

        //String类重写了Object中的equals方法
//        boolean result = s1.equals(s2);
//        System.out.println(result);

        //Objects工具类
        boolean result = Objects.equals(s1, s2);//正常比较。 没有出现：空指针异常
        System.out.println(result);
    }
}
