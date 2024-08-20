package com.atguigu.stringbuilder;

public class Demo3 {

    /*
        ### StringBuilder和String相互转换

    - StringBuilder转换为String
      - 通过构造方法  public String(Object obj)
      - 通过toString()方法
      - 通过subString(0,length)
    - String转换为StringBuilder
      - 通过构造方法 public StringBuilder(String s)
      - 通过append()方法
     */
    public static void main(String[] args) {

        /*StringBuilder sb = new StringBuilder("sdfjd");
        String s1 = new String(sb);
        String s2 = sb.toString();
        String s3 = sb.substring(0);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);*/
        System.out.println("--------------------");

        String str = "dkjfskl";
        StringBuilder sb1 = new StringBuilder(str);
        StringBuilder sb2 = new StringBuilder().append(str);

        System.out.println(sb1);
        System.out.println(sb2);

    }
}
