package com.itheima.polymorphic_test;

import java.util.Calendar;

/*
    1 多态的优缺点 :
        1) 优点
            提高代码的扩展性
        2) 缺点
            不能调用子类特有的功能

    2 多态的转型
        1) 向上转型
            父类的引用指向了子类对象(把子类类型的对象赋值给父类类型)
        2) 向下转型
            把父类类型的对象赋值给子类类型的变量
            直接赋值会报错 , 需要做一个强转


            Animal an = new Dog();
            //  把父类类型的对象赋值给子类类型的变量
            Dog dog = (Dog)an;

           注意 :
             1 想要调用子类特有的功能 , 需要向下转型
             2 对象的本质类型 , 和转型的类型不匹配就会发生 classCastException:类型转换异常

    注意 : 方法的参数是一个类 , 那么调用此方法需要传入此类的对象或者此类的子类对象 !!!
 */
public class Test1 {
    public static void main(String[] args) {
        useAnimal(new Dog());
        System.out.println("================");
        useAnimal(new Cat());
        System.out.println("================");
        useAnimal(new Pig());
    }

    public static void useAnimal(Animal a) {
        a.eat();

        // 子类特有功能
        // 向下转型
        if (a instanceof Dog) {
            Dog dog = (Dog) a;
            dog.lookHome();
        }

        if(a instanceof Cat){
            Cat cat = (Cat) a;
            cat.catchMouse();
        }

        if(a instanceof Pig){
            ((Pig) a).sleep();
        }

    }

//    // 测试狗类
//    public static void useAnimal(Dog dog) {
//        dog.eat();
//        dog.lookHome();
//    }
//
//    // 测试猫类
//    public static void useAnimal(Cat cat) {
//        cat.eat();
//        cat.catchMouse();
//    }
//
//    // 测试猪类
//    public static void useAnimal(Pig pig) {
//        pig.eat();
//        pig.sleep();
//    }
}
