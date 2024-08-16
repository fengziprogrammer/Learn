package com.itheima.enum_app.analyse;

/**
 * 枚举其实本质上是一个类，每一个枚举项是本枚举类类型的一个对象。
 * 
 * 枚举类型也是属于类，允许定义其他成分，比如构造器，成员方法，成员变量等。但是定义的成分一定要在枚举项之后，而且最后一个枚举项必须要有分号结束。
 */
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
