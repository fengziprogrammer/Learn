package com.atguigu.stringbuilder;

public class Demo1 {

    /*
    StringBuilder 可变字符序列
    地址值不变的情况下,属性值可以发生改变

    StringBuilder 里面的方法如果 返回值是 StringBuilder  返回的是该对象本身
     */
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("");
        sb1.append(3.3);
        sb1.append(true);
        sb1.append("aaa");
        System.out.println(sb1);//"'
       /* System.out.println(sb2);//3.3
        System.out.println(sb3);//3.3true
        System.out.println(sb4);//3.3trueaaa

        System.out.println(sb1 == sb2);
        System.out.println(sb1 == sb3);
        System.out.println(sb1 == sb4);*/
    }
}
