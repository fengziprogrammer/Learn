package com.itheima.homework.work;

public enum Sex {
    // 枚举项就是枚举的对象
    GIRL("女"), BOY("男");

    // 成员变量
    private String name;// "男"

    // 构造方法 , 必须私有
    private Sex() {
    }

    private Sex(String name) {
        this.name = name;
    }

    // 成员方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
