package com.itheima.abstract_demo;

/*
    需求：定义猫类（Cat）和狗类（Dog）
	    猫类成员方法：eat（猫吃鱼）drink（喝水…）
	    狗类成员方法：eat（狗吃肉）drink（喝水…）

    注意事项 :
        1 抽象类必须使用abstract关键字修饰
        2 抽象类不能创建对象
            存在构造方法 : 让子类通过super(...) 去访问,  从而给抽象类中的私有变量初始化
        3 抽象类中可以有抽象方法也可以有非抽象方法 , 但是抽象方法必须存在抽象类中
                抽象方法   : 让子类必须完成某些功能, 相当一种规范
                非抽象方法 : 让子类去继承 , 提高代码的复用性
        4 抽象的子类
            要么重写抽象类中所有的抽象方法
            要么子类是一个抽象类
 */
public class AnimalTest {
    public static void main(String[] args) {
        // Animal animal = new Animal();
    }
}

class Dog extends Animal{

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }
}

// 抽象方法必须存在抽象类中!!!
abstract class Animal {
    // 一个方法要么有方法体 , 要么此方法是一个抽象方法 , 抽象方法需要使用abstract关键字修饰
    public abstract void eat();
    public abstract void sleep();

    public void drink(){

    }
}
