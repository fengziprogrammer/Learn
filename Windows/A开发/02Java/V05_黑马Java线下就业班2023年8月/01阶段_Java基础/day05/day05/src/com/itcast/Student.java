package com.itcast;

/*
    类: 对一类具有共同属性和行为事物的描述 (设计图)
    对象: 根据类创建出来的实体

    定义学生类
        1.属性(成员变量) 成员位置:类中方法外
            姓名
            年龄
        2.行为(成员方法)
            学习();
            吃饭();
 */
public class Student {
    //成员变量: 必须私有
    private String name;
    private int age;

    /*
        构造方法: 提供两种
            1.如果我们不提供构造,系统会发一个空参构造
            2.如果我们提供了带参构造,系统就不给空参构造了
            3.结论: 两种都提供! 调用者选择哪一个都可以!
     */
    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //成员方法: 针对私有的属性, 必须提供对应的get和set方法
    public void setName(String name) {
        /*
            this可以代表当前类对象, 谁调用方法, 方法中的this就是谁
            this可以用来调用本类成员
            作用: 解决局部变量和成员变量重名问题的!
         */
        //System.out.println("打印this:" + this);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //成员方法: 其他方法根据需求走
    public void study() {
        System.out.println("学生在学习..");
    }

    public void eat() {
        System.out.println("学生在吃饭..");
    }
}
