package com.atguigu.demo;

/*
定义一个父类 Person
            共性属性:姓名,年龄
            共性功能:睡觉
            共性抽象功能: show()  作用是描述自己是什么类,属性值是多少
 */
public abstract class Person implements Eat{

    // 共性属性:姓名,年龄
    private String name;
    private int age;

    public Person() {
        System.out.println("-----fu--------空参");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

        System.out.println("-----fu--------有参");
    }

  /*  public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    // 共性功能:睡觉
    public void sleep(){
        System.out.println("-----fu__sleep");
    }
    // 共性抽象功能: show()  作用是描述自己是什么类,属性值是多少
    public  abstract  void show();
}
