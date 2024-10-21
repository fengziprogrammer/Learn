package com.atguigu.exer;

public class Demon {
    private String name;

    public Demon(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Demon{" +
                "name='" + name + '\'' +
                '}';
    }
}
