package com.atguigu.inner;

public class Demo3 {

    /*
    局部内部类
        书写位置
            方法内

           分类 三种
            最常见的最后一种

            匿名内部类
                new InterAA()  代表的是该接口的实例
                new InterAA(){};// 代表的是该接口的实现类对象
                作用域{}
     */
    public static void main(String[] args) {

    }
}

class ClassAA{

    public  void method1(){
        //class ClassBB{}  // 方式一 局部内部类  标准写法   一般不用
    }

    // 方式二  局部内部类  返回一个局部内部类的实例(类定义在方法内部)
    public InterAA method2(){
        // return new InterAA(); 接口不能实例化
        // class ClassBB implements  InterAA{}  一般也不用
        // return  new classBB();

        return  new InterAA(){
            @Override
            public void show() {
                System.out.println("111111111");
            }
        };// 常见用法  本质 一个实现了接口InterAA的实现类对象
    }
}

interface  InterAA{
    void show();
}

class ClassBB implements InterAA{

    @Override
    public void show() {

    }
}
