package com.itheima.sh.d_reflect_04;

public class Person {

    //成员变量
    private String address;

    //定义方法
    public void show(){
        System.out.println("show.....");
    }



    private static String method(int x,String s){
        System.out.println("method....x="+x+"---"+s);
        //返回给调用者
        return s;
    }
}
