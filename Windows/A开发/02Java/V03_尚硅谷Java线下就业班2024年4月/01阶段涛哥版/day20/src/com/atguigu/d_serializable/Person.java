package com.atguigu.d_serializable;

import java.io.Serializable;

public class Person implements Serializable {
    static final long serialVersionUID = 42L;
    private String name1;
    private Integer age;

    public Person() {
    }

    public Person(String name, Integer age) {
        this.name1 = name;
        this.age = age;
    }

    public String getName() {
        return name1;
    }

    public void setName(String name) {
        this.name1 = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name1 + '\'' +
                ", age=" + age +
                '}';
    }
}
