package com.itheima.extends_demo;

// 子类
public class Teacher extends Person {
    private String workId;

    public Teacher() {
    }

    public Teacher(String name, int age, String workId) {
        super(name, age);
        this.workId = workId;
    }

    public String getWorkId() {
        return workId;
    }

    public void setWorkId(String workId) {
        this.workId = workId;
    }

    public void teach() {
        System.out.println("讲课...");
    }
}
