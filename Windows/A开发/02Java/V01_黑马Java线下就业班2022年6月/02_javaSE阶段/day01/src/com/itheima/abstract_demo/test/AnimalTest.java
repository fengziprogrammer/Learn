package com.itheima.abstract_demo.test;

/*
    需求：定义猫类（Cat）和狗类（Dog）

        共同属性 : 品种 , 颜色 , 年龄
	    猫类成员方法：eat（猫吃鱼）drink（喝水…）
	    狗类成员方法：eat（狗吃肉）drink（喝水…）
 */
public class AnimalTest {
    public static void main(String[] args) {
        // 空参构造 + set方法
        Cat cat = new Cat();
        cat.setBreed("波斯猫");
        cat.setColor("黄色");
        cat.setAge(3);
        System.out.println("品种:" + cat.getBreed());
        System.out.println("颜色:" + cat.getColor());
        System.out.println("年龄:" + cat.getAge());
        cat.eat();
        cat.drink();
        cat.catchMouse();

        System.out.println("================");


        // 全参构造
        Cat cat2 = new Cat("美短" , "灰色" , 2);
        System.out.println("品种:" + cat2.getBreed());
        System.out.println("颜色:" + cat2.getColor());
        System.out.println("年龄:" + cat2.getAge());
        cat2.eat();
        cat2.drink();
        cat2.catchMouse();
    }
}

