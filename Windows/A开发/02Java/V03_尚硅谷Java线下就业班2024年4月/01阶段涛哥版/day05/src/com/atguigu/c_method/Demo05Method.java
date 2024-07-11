package com.atguigu.c_method;

public class Demo05Method {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        /*
          a = 10
          b = 20

          传递a和b,仅仅是传递a和b的值,不是变量本身
         */
        boolean compare = compare(a, b);
        System.out.println("compare = " + compare);
    }

    public static boolean compare(int a,int b){
        if (a>b){
            return true;
        }else{
            return false;
        }
    }
}
