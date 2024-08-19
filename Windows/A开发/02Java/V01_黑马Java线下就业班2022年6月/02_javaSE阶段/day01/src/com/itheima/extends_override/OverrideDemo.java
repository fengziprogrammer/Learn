package com.itheima.extends_override;
/*
    1 方法重写的概述 : 子类和父类出现了一模一样的方法(方法名 , 参数列表)

    2 为什么要学习方法重写 ?
        父类的功能满足不了子类 , 子类就可以重写父类的方法 , 既可以增加新的功能
        又可以沿袭父类的功能

    3 方法重写的注意事项
        1) 方法名和参数列表需要保持一致
        2) 私有的方法是无法重写
        3) @Override : 注解 , 用来标记方法 , 被标记的方法,代表的是此方法是重写父类的方法
            作用 : 检测修饰的方法是否是重写父类的方法
        4) 子类重写父类的方法 ,子类方法的权限必须大于或等于父类方法的权限
 */
public class OverrideDemo {
}
