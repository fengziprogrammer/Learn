package com.atguigu.c_wait_notify;

public class BaoZiPu {
    //定义count,代表包子数量
    private int count;
    //定义flag,代表有没有包子
    private boolean flag;

    public BaoZiPu() {
    }

    public BaoZiPu(int count, boolean flag) {
        this.count = count;
        this.flag = flag;
    }

    //改造get方法,调用此方法进行消费
    public void getCount() {
        System.out.println("消费了第..."+count+"个包子");
    }

    //改造set方法,调用此方法进行生产
    public void setCount() {
        count++;
        System.out.println("生产了第......"+count+"个包子");
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
