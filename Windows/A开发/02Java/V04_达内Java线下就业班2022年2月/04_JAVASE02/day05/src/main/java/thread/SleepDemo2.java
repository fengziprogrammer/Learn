package thread;

/**
 * sleep方法要求我们必须处理中断异常。
 * 当一个线程调用sleep处于阻塞的过程中，这个线程的interrupt方法被调用时会
 * 中断它的睡眠阻塞，此时sleep方法就会抛出中断异常。
 */
public class SleepDemo2 {
    public static void main(String[] args) {
        Thread lin = new Thread(){
            public void run(){
                System.out.println("林:刚美完容，睡一会...");
                try {
                    Thread.sleep(10000000);
                } catch (InterruptedException e) {
                    System.out.println("林:干嘛呢！干嘛呢！干嘛呢！都破了相了!");
                }
                System.out.println("林:醒了!");
            }
        };

        Thread huang = new Thread(){
            public void run(){
                System.out.println("黄:开始砸墙!");
                for(int i=0;i<5;i++){
                    System.out.println("黄:80!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                }
                System.out.println("咣当!");
                System.out.println("黄:搞定!");
                lin.interrupt();//中断lin线程的睡眠阻塞

            }
        };

        lin.start();
        huang.start();

    }
}







