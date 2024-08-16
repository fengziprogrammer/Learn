package com.itheima.exds.constructor.trait;

//子类 继承父类
public class Son extends Father {
    public Son() {
        //隐藏代码：super();
        this("黑马");//调用：Son(String name)

        System.out.println("Son类 -> 无参构造方法");
    }

    public Son(String name){
        //隐藏代码：super();

        //调用父类中的有参构造方法
        super(name);

        System.out.println("Son类 -> String参数构造方法");
    }
}
