package com.itheima.homework;

public class Manager extends Employee{
    private Clerk clerk;

    public Manager(){}

    public Manager(String name , String workId , String dept ,  Clerk clerk){
        super(name , workId , dept);
        this.clerk = clerk;
    }

    @Override
    public void showMsg() {
        System.out.println(getDept() + "的:"+getName()+",员工编号:" + getWorkId() +
                "他的职员是" + clerk.getName());
    }

    public Clerk getClerk() {
        return clerk;
    }

    public void setClerk(Clerk clerk) {
        this.clerk = clerk;
    }
}
