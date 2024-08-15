package com.atguigu.d_string;

public class Demo01String {
    public static void main(String[] args) {
        //1.String() -> 根据空参构造创建String对象
        String s1 = new String();
        System.out.println(s1);
        //2.String(String original) -> 根据有参构造创建String对象,带内容
        String s2 = new String("abc");
        System.out.println(s2);
        //3.简化:String 变量名 = ""
        String s3 = "abc";
        System.out.println(s3);

    }
}
