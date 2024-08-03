package com.atguigu.test;

public class Demo3 {


}

/*
代码维度
    interface  接口
        特殊的事物,特殊的class
        可以弥补了单继承的缺点

       现实维度:
            本质: 提供了规则,扩展功能
       举例
           第一类电脑  台式机: 组成 显示器,主机 ,鼠标,键盘等等
           子类笔记本   组成:显示器,主机 ,鼠标,键盘等等

           USB接口
            提供规则 ,扩展功能
                尺寸规则/物理元件线路排布规则
                扩展U盘
            学生类
                功能: 学习,吃饭,睡觉
                存在一个功能 java开发()

                学生A   自定义 java开发()
                学生B   自定义 java开发()
                学生C   自定义 java开发()
                有很多的学生 都需要 java开发()
                如果存在一个事物 提供 java开发()   --> 尚硅谷培训机构

                学生类  extends 尚硅谷接口  不对  学生不是培训机构的一种 不是所属关系
                学生类 实现(implements) 尚硅谷接口  扩展了对应的功能


    定义格式
        参考 权限修饰符 class 类名{}
        修饰符 interface 接口名{}
 */
abstract class Person{
    public abstract void eat();

    public abstract void sleep();
}

class Student extends Person {

    @Override
    public void eat() {
        System.out.println("eat");
    }

    @Override
    public void sleep() {
        System.out.println("sleep");
    }

    public void study(){
        System.out.println("-------学生学习");
    }



    // public  void studyJava(){}
}

class JavaStudent extends  Student implements SGG{

    @Override
    public void studyJava() {
        System.out.println("具备了java开发的功能");
    }
}

interface SGG{
    public abstract void studyJava();
}