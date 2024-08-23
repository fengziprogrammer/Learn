package com.itheima.interface_demo.inteface_staticmethod;
/*
    JDK8版本 : 定义静态方法
    格式 : public static 返回值类型 方法名(参数){ }

    作用 : 方便使用!

    注意事项 :
        1 public可以省略 , 但是static不可以省略
        2 调用方式只有一种 , 只能通过接口名字进行调用
 */
public class Test {
    public static void main(String[] args) {
        InterImpl inter = new InterImpl();
        // inter.show();
        // InterImpl.show();

        InterA.show();
        InterB.show();
    }
}
