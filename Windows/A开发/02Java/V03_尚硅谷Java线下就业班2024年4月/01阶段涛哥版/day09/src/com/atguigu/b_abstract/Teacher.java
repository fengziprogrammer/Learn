package com.atguigu.b_abstract;

public  class Teacher extends Employee{
    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println("讲师在讲课");
    }

}
