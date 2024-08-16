package com.itheima.interface_app.demo3;

/**
 * @BelongsProject: javase-oop
 * @BelongsPackage: com.itheima.interface_app.demo3
 * @Auther: Double 17839227351@163.com
 * @Date: 2022/10/29 17 48
 * @Since JDK 17.0
 * @Description
 */
public enum Sex {

    //枚举是一种多例模式
    YAO,BOY("男孩儿"),GIRL("女孩儿");
    //成员变量
    private String msg;
    //构造方法
    private Sex(){

    }
    private Sex(String msg){
        this.msg = msg;
    }
    //成员方法
    public void show(){
        System.out.println(msg);
    }
}
