package com.atguigu.e_string;

public class Demo03Equals {
    public static void main(String[] args) {
        String s = null;
        method(s);
    }

    private static void method(String s) {
        //如果将变量s,放到equals前面,假如s为null,此处很容易出现空指针异常
        /*if (s.equals("root")){
            System.out.println("字符串内容是root");
        }else{
            System.out.println("字符串内容不是root");
        }*/

        //我们应该将定值放到前面
        /*if ("root".equals(s)){
            System.out.println("字符串内容是root");
        }else{
            System.out.println("字符串内容不是root");
        }*/
    }
}
