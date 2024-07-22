package com.atguigu.method;

public class Rectangle {
    //length和width是实例变量，因为它们在方法外面声明，它们不是static修饰的，是非静态的成员变量，通常叫做实例变量
    double length;
    double width;

    void print(char sign){
        //sign和i,j都是局部变量，因为它们是形参和方法体中声明的局部变量
        for(int i=1; i<=length; i++){
            for(int j=1; j<=width; j++){
                System.out.print(sign);
            }
            System.out.println();
        }
    }
    String getInfo(){
        return "长：" + length
                + "，宽：" + width;
    }
}
