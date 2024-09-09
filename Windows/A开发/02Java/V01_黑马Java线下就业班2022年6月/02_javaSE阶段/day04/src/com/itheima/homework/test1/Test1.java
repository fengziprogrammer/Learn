package com.itheima.homework.test1;

/*
    有以下类定义：

    动物类
    属性：名称、年龄、性别
    行为：吃


    猫类继承动物
    行为：
      吃（重写）
      捉老鼠

    狗类继承动物
    行为：
      吃（重写）
      看家

    请按要求定义上述类，并用多态的格式测试调用“吃饭”和“捉老鼠”的方法，看看有什么特点？


 */
public class Test1 {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.eat();
        ((Cat) cat).catchMouse();

        Animal dog = new Dog();
        dog.eat();
        ((Dog) dog).lookHome();
    }
}

