package com.itheima.exds.constructor.memory;

//学生（子类）
public class Student extends Person{
    //成员变量
    private int score;

    public Student() {
        //隐藏代码：super();  //调用父类中的无参构造方法

        super("黑马",23);
    }

    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
