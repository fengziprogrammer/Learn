package com.atguigu.exer;

public class Person<T> {
    private String name;
    private T lover;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, T lover) {
        this.name = name;
        this.lover = lover;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getLover() {
        return lover;
    }

    public void setLover(T lover) {
        this.lover = lover;
    }

    @Override
    public String toString() {
        if(lover instanceof Person){
            return "Person{" +
                    "name='" + name + '\'' +
                    ", lover=" + ((Person) lover).getName()  +
                    '}';
        }
        return "Person{" +
                "name='" + name + '\'' +
                ", lover=" + lover  +
                '}';
    }
}
