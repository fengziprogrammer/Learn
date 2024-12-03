package thread;

/**
 * 线程
 * 线程可以多个代码片段"同时运行"。实际上是并发运行。
 * 创建线程有两种方式:
 * 1:定义一个类继承Thread并重写run方法。run方法中定义线程要执行的任务代码
 */
public class ThreadDemo1 {
    public static void main(String[] args) {
        Thread t1 = new MyThread1();
        Thread t2 = new MyThread2();
        /*
            启动线程要调用start方法，而不是run方法。当线程的start方法调用
            后，该线程的run方法很快会被该线程自动执行。
         */
        t1.start();
        t2.start();
    }
}

/**
 * 第一种创建线程的方式优点在于:
 * 结构简单，直接。利于匿名内部类形式创建。
 *
 * 缺点:
 * 1:由于java是单继承的，这会导致如果继承了Thread就不能再继承其他的类去复用
 *   方法，这在实际开发中是非常不方便的。
 * 2:重写了run方法意味着将线程要执行的任务定义在了线程中，这导致线程与任务存在
 *   必然的耦合关系，不利于线程的重用。
 */
class MyThread1 extends Thread{
    public void run(){
        for(int i=0;i<1000;i++){
            System.out.println("你是谁啊?");
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        for(int i=0;i<1000;i++){
            System.out.println("开门!查水表!");
        }
    }
}