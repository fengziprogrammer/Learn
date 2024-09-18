package com.itheima.genericity_demo.genericity_class;

/*
    泛型类
        定义一个人类，定义一个属性表示爱好，但是具体爱好是什么不清楚，可能是游泳，乒乓，篮球。
 */
public class Demo2 {
    public static void main(String[] args) {
        Person<String> p = new Person<>();
        Person<Swim> p2 = new Person<>();
        Person<Basketball> p3 = new Person<>();
    }
}

class Person<H> {
    private H hobby;// 爱好

    public Person() {
    }

    public Person(H hobby) {
        this.hobby = hobby;
    }

    public H getHobby() {
        return hobby;
    }

    public void setHobby(H hobby) {
        this.hobby = hobby;
    }
}

class Swim {
}

class PingPong {
}

class Basketball {
}

