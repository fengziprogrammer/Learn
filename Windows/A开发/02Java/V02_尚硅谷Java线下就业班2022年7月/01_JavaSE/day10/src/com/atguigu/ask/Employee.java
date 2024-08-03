package com.atguigu.ask;

public class Employee {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo(){
        return "姓名：" + name;
    }
}
