package com.atguigu.communicate;

/*
线程通信是用在生产者和消费者问题中。

生产者与消费者问题：
    一个（些）线程负责生产数据（即增加共享数据的值）
    一个（些）线程负责消耗数据（即减少共享数据的值）


生产者与消费者问题，有没有线程安全问题？
    如何判断有没有线程安全问题？
    （1）是否存在多个线程（2个或2个以上的线程）
    （2）这多个线程是否有共享数据：这里有，Workbench的total
    （3）多个线程是否既有读操作又有写操作（修改）
    那么一定有线程安全。

    有线程安全问题，就一定要加同步锁。
    同步锁有两种加法，同步方法，同步代码块。

在java.lang.Object类中：
wait()：
notify()：
    当这两个方法不是线程的监视器对象调用时，会报IllegalMonitorStateException （非法监视器异常）
    监视器对象：同步锁对象


例子：小肖开个饭店。
小肖作为厨师，女朋友作为服务员。
刚开始，饭店比较小，只有它俩。
后厨与大堂之间有一个窗口，这个窗口上面有一个工作台，工作台用来放做好的菜。
小肖做好一盘菜，就会“摇铃”，告诉他女朋友，可以取菜了。

工作台有限，只能放5盘菜，多了放不下。
当工作台上面的菜已经满了，小肖就休息，不继续做菜了。等他女朋友取走这个菜（可以是一盘，可以多盘）之后，再做菜。
当工作台上是空的，他女朋友就休息一下，等到小肖做好菜在叫她。
 */
public class TestCommunicate {
    public static void main(String[] args) {
        Workbench w = new Workbench();
        new Thread("小肖"){
            public void run(){
                while(true){
                    w.put();
                }
            }
        }.start();

        new Thread("花花"){
            public void run(){
                while(true){
                    w.take();
                }
            }
        }.start();
    }
}
//Workbench工作台
class Workbench{
    private final int MAX_TOTAL = 5;
    private int total;//菜的数量

    //同步方法的锁对象，非静态方法的锁对象是this
    public synchronized void put(){
        if(total >= MAX_TOTAL){
//            做菜的线程停下来等待
            try {
                this.wait();//this.可以省略
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        total++;
        System.out.println(Thread.currentThread().getName()+"做了一份菜，数量：" + total);
        this.notify();
    }

    public synchronized void take(){
        if(total<=0){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        total--;
        System.out.println(Thread.currentThread().getName()+"取走了一份菜，数量：" + total);
        this.notify();
    }
}
