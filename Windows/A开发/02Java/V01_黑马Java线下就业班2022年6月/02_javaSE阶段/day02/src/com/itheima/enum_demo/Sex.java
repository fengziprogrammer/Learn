package com.itheima.enum_demo;

public enum Sex {
    // 每一个枚举项都是枚举的对象
    GIRL("女孩"), BOY("男孩"), YAO;

    // 成员变量
    private String name;

    // 空参构造方法
    private Sex() {
    }

    // 有参构造方法
    private Sex(String name) {
        this.name = name;
    }

    // 成员方法
    public String getName() {
        return name;
    }
}

class Test {
    public static void main(String[] args) {
        System.out.println(Sex.GIRL.getName());
        System.out.println(Sex.BOY.getName());
        System.out.println(Sex.YAO.getName());
    }
}
