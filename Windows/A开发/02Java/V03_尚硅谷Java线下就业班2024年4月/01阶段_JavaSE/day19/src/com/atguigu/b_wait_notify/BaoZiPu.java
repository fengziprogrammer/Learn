package com.atguigu.b_wait_notify;

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
    public synchronized void getCount() {
        if (flag==false){
            //1.如果flag为false,证明没有包子,消费线程等待
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //2.如果出了if,或者不走if,有包子,需要消费了
        System.out.println("消费了第..."+count+"个包子");
        //3.改变flag状态为false,证明消费完了,没有包子了
         flag = false;
        //4.唤醒生产线程
        this.notify();
    }

    //改造set方法,调用此方法进行生产
    public synchronized void setCount() {
        if (flag==true){
            //1.如果flag为true,证明有包子,生产线程等待
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //2.如果出了if,或者不走if,没有包子,需要生产了
        count++;
        System.out.println("生产了第......"+count+"个包子");
        //3.改变flag状态为true,证明生产完了,有包子了
        flag = true;
        //4.唤醒消费线程
        this.notify();
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
