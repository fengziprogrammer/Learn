package com.itheima.interface_demo.inteface_defaultmethod;
/*
    JDK8版本可以在接口中定义默认方法

    默认方法 :
        允许在接口中定义非抽象方法，但是需要使用关键字 default 修饰，这些方法就是默认方法
        作用 : 解决接口升级的问题
        格式 :
            public default 返回值类型 方法名(参数){ ... }
            public default void show(){ ... }

        注意事项 :
            1 默认方法不是抽象方法，所以不强制被重写。但是可以被重写，重写的时候去掉default关键字
            2 public可以省略，default不能省略
            3 如果实现了多个接口，多个接口中存在相同的方法声明
                子类就必须对该方法进行重写
 */
public class Test {

}
