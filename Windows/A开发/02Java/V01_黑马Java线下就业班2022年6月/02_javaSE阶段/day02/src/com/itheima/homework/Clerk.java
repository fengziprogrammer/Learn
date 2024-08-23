package com.itheima.homework;

public class Clerk extends Employee {
    private Manager manager;// 0x002

    public Clerk() {
    }

    public Clerk(String name, String workId, String dept, Manager manager) {
        super(name, workId, dept);
        this.manager = manager;
    }

    @Override
    public void showMsg() {
        System.out.println(getDept() + "的:" + getName() + ",员工编号:" + getWorkId() +
                "他的经理是" + manager.getName());
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {// manager = 0x002
        this.manager = manager;
    }
}
