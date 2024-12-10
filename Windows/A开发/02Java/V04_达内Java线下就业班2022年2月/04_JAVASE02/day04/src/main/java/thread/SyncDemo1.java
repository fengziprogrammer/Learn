package thread;

/**
 *  多线程并发的安全问题
 *  当多个线程并发操作同一临界资源，由于线程切换的实际不确定，导致操作顺序
 *  出现混乱。严重时可能出现系统瘫痪等问题。
 *  总结起来就是多线程抢同一个东西导致的混乱。
 *
 *  临界资源:操作过程只能被单线程进行的资源。
 */
public class SyncDemo1 {
    public static void main(String[] args) {
        Table table = new Table();
        Thread t1 = new Thread(){
            public void run(){
                while(true){
                    int bean = table.getBean();
                    Thread.yield();
                    System.out.println(getName()+":"+bean);
                }
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                while(true){
                    int bean = table.getBean();
                    Thread.yield();
                    System.out.println(getName()+":"+bean);
                }
            }
        };
        t1.start();
        t2.start();
    }
}

class Table{
    private int beans = 20;//桌子上有20个豆子

    /**
     * 当一个方法使用synchronized修饰后，这个方法成为同步方法，即:多个线程
     * 不能同时在方法内部执行。
     * 将多线程并发操作临界资源改为同步执行可以解决并发安全问题。
     */
    public synchronized int getBean(){
        if(beans==0){
            throw new RuntimeException("没有豆子了!");
        }
        Thread.yield();//让当前线程主动放弃时间片
        return beans--;
    }

}



