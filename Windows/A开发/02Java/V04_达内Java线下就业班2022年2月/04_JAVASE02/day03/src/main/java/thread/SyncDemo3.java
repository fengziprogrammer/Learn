package thread;

/**
 * 静态方法上如果使用synchronized修饰后，该方法一定具有同步效果。
 * 静态方法上使用的锁对象(同步监视器对象)是当前类的类对象，一个Class的实例
 *
 * Class后面讲放射的时候会详细说明。在JVM中每个被加载的类都有且只有一个Class
 * 的实例与之对应，静态方法锁的就是这个对象。
 *
 */
public class SyncDemo3 {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            public void run(){
                Boo.dosome();
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                Boo.dosome();
            }
        };
        t1.start();
        t2.start();
    }
}

class Boo{
//    public synchronized static void dosome(){
    public static void dosome(){
        //指定类对象作为同步监视器时的写法:当前类的类名.class
        synchronized (Boo.class) {
            Thread t = Thread.currentThread();
            System.out.println(t.getName() + ":正在执行dosome方法...");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(t.getName() + ":执行dosome方法完毕!");
        }
    }
}