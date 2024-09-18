package com.itheima.genericity_demo.genericity_class;

/*
    泛型类
        定义一个人类，定义一个属性表示爱好，但是具体爱好是什么不清楚，可能是游泳，乒乓，篮球。
 */
public class Demo {
    public static void main(String[] args) {
        // 没有泛型 , 那么默认就是Object类型
        Student s = new Student();

        Student<String , Integer> s2 = new Student<>();
    }
}

class Student<N , A>{
    N name;
    A age;

    public Student() {
    }

    public Student(N name, A age) {
        this.name = name;
        this.age = age;
    }

    public N getName() {
        return name;
    }

    public void setName(N name) {
        this.name = name;
    }

    public A getAge() {
        return age;
    }

    public void setAge(A age) {
        this.age = age;
    }
}