package thread;

/**
 * java中所有的代码都是线程运行的。main方法也不例外，该线程是虚拟机自行创建
 * 的。一般我们也称运行main方法的线程为"主线程"，因为它的名字也叫"main".
 *
 * 线程提供了一个静态方法:
 * Thread currentThread()
 * 可以获取到运行当前代码片段的线程
 */
public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread main = Thread.currentThread();
        System.out.println("主线程:"+main);
        dosome();

        Thread t = new Thread(){
            public void run(){
                Thread t = Thread.currentThread();
                System.out.println("自定义线程:"+t);
                dosome();
                //run后续内容...
            }
        };
        t.start();

        //main后续操作。。
    }

    public static void dosome(){
        Thread t = Thread.currentThread();
        System.out.println("运行dosome方法的线程:"+t);
    }
}
